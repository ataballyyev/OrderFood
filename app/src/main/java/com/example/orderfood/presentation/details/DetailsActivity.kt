package com.example.orderfood.presentation.details

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import com.bumptech.glide.Glide
import com.example.orderfood.data.model.Feed
import com.example.orderfood.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private var _binding: ActivityDetailsBinding? = null
    private val binding get() = _binding!!
    lateinit var objectFromIntent: Feed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        objectFromIntent = intent.getSerializableExtra("OBJECT") as Feed

        initializeUIWithObject()

        binding.backButton.setOnClickListener {
            onBackPressed()
        }

        binding.swipeRefreshLayout.setOnRefreshListener {
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }

    private fun initializeUIWithObject() {
        Glide.with(this)
            .load(objectFromIntent.display.images[0])
            .into(binding.imageViewFoods)
        binding.tvRating.text = String.format("%.1f", objectFromIntent.content.reviews.averageRating).toDouble().toString()
        binding.titleFoods.text = objectFromIntent.seo.web.`meta-tags`.title
        binding.descriptionFoods.text = objectFromIntent.seo.web.`meta-tags`.description
        if(objectFromIntent.display.source.introVideo.originalUrl != null) {
            binding.videoView.visibility = View.VISIBLE
            binding.tvHowToPrepare.visibility = View.VISIBLE
            val mediaController = MediaController(this)
            mediaController.setAnchorView(binding.videoView)
            binding.videoView.setMediaController(mediaController)
            binding.videoView.setVideoPath(objectFromIntent.display.source.introVideo.originalUrl.toString())
            binding.videoView.start()
        }
    }
}