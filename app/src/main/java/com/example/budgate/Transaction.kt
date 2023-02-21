package com.example.budgate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.budgate.Database.Database
import com.example.budgate.databinding.ActivityTransactionBinding

class Transaction : AppCompatActivity() {

    lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)
        var binding =ActivityTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {

            var intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        database= Database(applicationContext)

        var list=database.showData()

        binding.recycle.layoutManager=LinearLayoutManager(applicationContext)
        binding.recycle.adapter=RecycleAdapter(list)
    }
}