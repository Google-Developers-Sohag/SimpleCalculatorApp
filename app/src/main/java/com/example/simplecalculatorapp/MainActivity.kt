package com.example.simplecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var btnSum: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.et_num1)
        num2 = findViewById(R.id.et_num2)
        btnSum = findViewById(R.id.btn_sum)
        tvResult = findViewById(R.id.tv_result)

        btnSum.setOnClickListener {
            if (num1.text.isEmpty() || num2.text.isEmpty())
                Toast.makeText(this, "Enter Number Please", Toast.LENGTH_SHORT).show()
            else {
                val x = num1.text.toString().toInt()
                val y = num2.text.toString().toInt()
                val sum = x + y
                tvResult.text = sum.toString()
            }
        }
    }


}