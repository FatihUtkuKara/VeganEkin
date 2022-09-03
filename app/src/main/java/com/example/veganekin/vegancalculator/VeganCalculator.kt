package com.example.veganekin.vegancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.veganekin.R
import java.text.SimpleDateFormat
import java.util.*

class VeganCalculator : AppCompatActivity() {

        private lateinit var veganCalculatorEdit: EditText
        private lateinit var veganCalculatorResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegan_calculator)

        veganCalculatorResult = findViewById(R.id.veganCalculatorResult)
        veganCalculatorEdit = findViewById(R.id.veganCalculatorEdit)
        var date = Date()

        var df  = SimpleDateFormat("yyyy/MM/dd")
        veganCalculatorResult.setText(df.format(date).toString())

    }
}