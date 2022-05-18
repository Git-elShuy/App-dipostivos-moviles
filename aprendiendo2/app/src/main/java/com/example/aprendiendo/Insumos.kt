package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_insumos.*
import kotlinx.android.synthetic.main.activity_pantalla_compra_insu_tortillas.*

class Insumos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insumos)

        AtrasInsu.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaInicio:: class.java)
            startActivity(intent)
        }
    }
}