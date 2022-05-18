package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla_compra_insu_chorizo.*

class PantallaCompraInsuChorizo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_compra_insu_chorizo)


        AtrasComCho.setOnClickListener(){
            val intent: Intent = Intent (this, CompraInsumos:: class.java)
            startActivity(intent)
        }
    }
}