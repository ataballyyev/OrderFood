package com.example.orderfood.presentation.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orderfood.OrderFoodApp
import com.example.orderfood.data.model.Feed
import com.example.orderfood.data.utils.Utils
import com.example.orderfood.databinding.ActivityMainBinding
import com.example.orderfood.presentation.details.DetailsActivity
import com.example.orderfood.presentation.main.adapter.FoodsAdapter
import com.example.orderfood.presentation.main.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class MainActivity : AppCompatActivity(), FoodsAdapter.OnClickItemListener {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private var listFoods: List<Feed> = listOf()

    @Inject lateinit var viewModel: MainViewModel
    @Inject lateinit var adapter: FoodsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFunctionalities()

    }

    private fun initFunctionalities() {
        (applicationContext as OrderFoodApp).appComponent.inject(this)

        binding.swipeRefreshLayout.setOnRefreshListener {
            binding.swipeRefreshLayout.isRefreshing = false
        }
        adapter.setOnItemClick(this)
        binding.rvFoods.adapter = adapter
        binding.rvFoods.layoutManager = LinearLayoutManager(this)
        viewModel.getFoods(apiKey = Utils.FOODS_API_KEY).observe(this) { foodModel ->
            listFoods = foodModel.feed
            Log.i("RETROFIT", listFoods.toString())
            adapter.updateList(listFoods)
            binding.progressBar.visibility = View.GONE
            binding.swipeRefreshLayout.visibility = View.VISIBLE
        }
    }

    override fun onItemClick(position: Int) {
        if (listFoods[position].display.displayName == null) {
            Snackbar.make(binding.root, "This food does not open!", Snackbar.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("OBJECT", listFoods[position])
            startActivity(intent)
        }
    }
}