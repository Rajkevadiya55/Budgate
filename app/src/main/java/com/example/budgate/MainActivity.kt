package com.example.budgate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.budgate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ic.setOnClickListener {

            intent= Intent(applicationContext,AddActivity::class.java)
            startActivity(intent)


        }

    }
}