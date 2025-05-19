package com.prot.lakbayapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lakbayapp.databinding.ActivityRouteSelectionBinding

class RouteSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRouteSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRouteSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Your logic for the map, route inputs, and bottom navigation will go here.
        // This is a placeholder.
    }
}