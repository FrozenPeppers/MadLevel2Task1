package com.example.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.madlevel2task1.databinding.ActivityImageListBinding

class ImageListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    private fun initView(){

    }
}