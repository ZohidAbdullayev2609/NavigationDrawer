package com.example.navigationdrawer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawer.databinding.ItemLayoutBinding
import com.example.navigationdrawer.model.About

class MyRecycleAdapter :
    RecyclerView.Adapter<MyRecycleAdapter.ViewHolder>() {

    var list = ArrayList<About>()
    private var clickListener: ((About) -> Unit)? = null

    var lastPosition = -1

    inner class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.itemImage.setImageResource(this.image)
                binding.itemTitle.text = this.titul
                binding.itemDescription.text = this.description

                binding.cons.setOnClickListener {
                    clickListener?.invoke(this)
                }

            }
        }

        setAnimation(holder.itemView, position)
    }

    override fun getItemCount(): Int = list.size

    fun setAnimation(view: View, position: Int) {
        if (position > lastPosition) {
            val animation = AnimationUtils.loadAnimation(view.context, android.R.anim.slide_in_left)
            view.startAnimation(animation)
            lastPosition = position
        }
    }

    fun setClickListener(block: (About)  -> Unit) {
        clickListener = block
    }

}