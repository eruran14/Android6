package com.eru.homework6

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eru.homework6.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = ArrayList<Song>()
        addData(data)
        val adapter = SongAdapter(data = data){
            val intent = Intent(requireContext(), SecondActivity::class.java)
            intent.putExtra("key1", data[it].title)
            startActivity(intent)
        }
        binding.recycler.adapter = adapter
    }

    private fun addData(data: ArrayList<Song>){
        data.add(Song("Blank Space", "Taylor Swift", "3:22"))
        data.add(Song("Watch Me", "Silento", "5:36"))
        data.add(Song("Earned It", "The Weekend", "4:51"))
        data.add(Song("The Hills", "The Weekend", "3:41"))
        data.add(Song("Everything", "Alanis Morissette", "3:29"))
        data.add(Song("Lose Yourself", "Eminem", "5:20"))
        data.add(Song("High Hopes", "Kodaline", "3:50"))
        data.add(Song("Green Eyes", "Coldplay", "3:40"))
        data.add(Song("Mad World", "Gary Jules", "3:04"))
        data.add(Song("At Will", "G-Eazy", "2:50"))

    }
}