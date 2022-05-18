package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_presupuesto.*

class Presupuesto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presupuesto)

        PresuAtras.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaInicio:: class.java)
            startActivity(intent)
        }
    }
}