package com.kingrovers.employee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_KingRovers)
        setContentView(R.layout.activity_main)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false
    }
}