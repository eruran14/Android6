package com.eru.homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eru.homework6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragment(binding.container1.id, FirstFragment())
        addFragment(binding.container2.id, SecondFragment())


    }
}