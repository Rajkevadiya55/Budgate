package com.example.budgate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.budgate.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        var binding=ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.icAdd.setOnClickListener {

            intent = Intent(applicationContext,income::class.java)
            startActivity(intent)
        }

        binding.icRemove.setOnClickListener {

            intent= Intent(applicationContext,expense::class.java)
            startActivity(intent)
        }

    }
}