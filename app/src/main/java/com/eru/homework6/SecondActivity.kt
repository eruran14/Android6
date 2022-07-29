package com.eru.homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eru.homework6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val songTitle = intent.getStringExtra("key1")
        binding.tv1.text = songTitle
    }
}