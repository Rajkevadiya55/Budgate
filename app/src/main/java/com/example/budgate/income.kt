package com.example.budgate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.budgate.Database.Database
import com.example.budgate.databinding.ActivityIncomeBinding

class income : AppCompatActivity() {

    lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_income)
        var binding=ActivityIncomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database=Database(applicationContext)

        binding.back.setOnClickListener {

            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.save.setOnClickListener {

            database.addExpense(
                binding.edtepayment.text.toString().toInt(),
                binding.edtepayment.text.toString()
            )
        }
    }
}