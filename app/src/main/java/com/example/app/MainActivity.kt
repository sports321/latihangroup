package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.app.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProductnike: Button = findViewById(R.id.btn_nike)
        btnProductnike.setOnClickListener(this)

        val btnPrductsnek: Button = findViewById(R.id.btn_snek)
        btnPrductsnek.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_nike -> {
                val mnike = Intent(this@MainActivity, PrdNike::class.java)
                startActivity(mnike)
            }
            R.id.btn_snek -> {
                val msnek = Intent(this@MainActivity, PrdSnek::class.java)
                startActivity(msnek)
            }
        }
    }
}