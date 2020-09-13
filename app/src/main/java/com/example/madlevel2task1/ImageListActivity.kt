package com.example.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.madlevel2task1.adapter.PlaceAdapter
import com.example.madlevel2task1.databinding.ActivityImageListBinding
import com.example.madlevel2task1.model.PlaceModel
import kotlinx.android.synthetic.main.activity_image_list.*

class ImageListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageListBinding

    private val places = arrayListOf<PlaceModel>()
    private val placeAdapter = PlaceAdapter(places)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        rvPlaces.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rvPlaces.adapter = placeAdapter

        for (i in PlaceModel.PLACE_NAMES.indices) {
            places.add(PlaceModel(PlaceModel.PLACE_NAMES[i], PlaceModel.PLACE_RES_DRAWABLE_IDS[i]))
        }
    }
}