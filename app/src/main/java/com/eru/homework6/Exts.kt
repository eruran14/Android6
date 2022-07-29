package com.eru.homework6

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragment(container:Int, fragment: Fragment){
    supportFragmentManager.beginTransaction().add(container, fragment).commit()
}

