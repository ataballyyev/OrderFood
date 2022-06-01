package com.example.orderfood.presentation.main.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.orderfood.R
import com.example.orderfood.data.model.Feed
import javax.inject.Inject

class FoodsAdapter @Inject constructor(): RecyclerView.Adapter<FoodsAdapter.FoodsViewHolder>() {

    private var listResults: List<Feed> = listOf()
    lateinit var onClickItemListener: OnClickItemListener

    inner class FoodsViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener {
        val imageView: ImageView = view.findViewById(R.id.ivItem)
        val textView: TextView = view.findViewById(R.id.tvTitle)

        init {
            this.itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            onClickItemListener.onItemClick(adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return FoodsViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: FoodsViewHolder, position: Int) {
        holder.textView.text = listResults[position].display.displayName
        if(listResults[position].display.displayName == null) {
            holder.textView.text = listResults[position].display.title
        }
        if (listResults[position].display.images[0].isNotEmpty()) {
            Glide.with(holder.imageView.context)
                .load(listResults[position].display.images[0])
                .into(holder.imageView)
        }
    }

    override fun getItemCount() = listResults.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(list: List<Feed>) {
        listResults = list
        notifyDataSetChanged()
    }

    fun setOnItemClick(onClick: OnClickItemListener) {
        onClickItemListener = onClick
    }

    interface OnClickItemListener {
        fun onItemClick(position: Int)
    }
}