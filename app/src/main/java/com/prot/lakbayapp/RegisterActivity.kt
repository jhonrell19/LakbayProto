package com.prot.lakbayapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lakbayapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Your logic for input fields and the register button will go here.
        // This is a placeholder.
    }
}