package com.example.budgate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.budgate.Database.Database
import com.example.budgate.databinding.ActivityExpenseBinding

class expense : AppCompatActivity() {
    lateinit var  database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense)
        var binding =ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)

      database= Database(applicationContext)

        binding.back.setOnClickListener {

            var intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.saveto.setOnClickListener {

            database.addExpense(
                binding.edttexpense.text.toString().toInt(),
                binding.edttpayment.text.toString()
            )
        }
    }
}