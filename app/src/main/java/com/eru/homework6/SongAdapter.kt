package com.eru.homework6

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eru.homework6.databinding.ItemSongBinding

class SongAdapter(private val data: ArrayList<Song>, private val onClick: (pos: Int) -> Unit)
    : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = data.size

    private fun getSong(position: Int):Song = data[position]

    inner class SongViewHolder(private val binding: ItemSongBinding): RecyclerView.ViewHolder(binding.root){

        @SuppressLint("SetTextI18n")
        fun bind(){
            binding.songTitle.text = getSong(adapterPosition).title
            binding.songArtist.text = getSong(adapterPosition).artist
            binding.tvOrder.text = (adapterPosition + 1).toString()
            binding.songDuration.text = getSong(adapterPosition).duration.toString()

            binding.root.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }
}