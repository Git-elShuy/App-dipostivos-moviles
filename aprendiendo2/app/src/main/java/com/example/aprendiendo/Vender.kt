package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vender.*

class Vender : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vender)


        VenderAtras.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaInicio:: class.java)
            startActivity(intent)
        }
    }
}