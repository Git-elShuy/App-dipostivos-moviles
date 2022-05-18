package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_compra_insumos.*

class CompraInsumos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compra_insumos)

        CompraInsuChori.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaCompraInsuChorizo:: class.java)
            startActivity(intent)
        }

        CompraInsuFrijol.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaCompraInsuFrijol:: class.java)
            startActivity(intent)
        }

        CompraInsuTortillas.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaCompraInsuTortillas:: class.java)
            startActivity(intent)
        }

        compInsuAtras.setOnClickListener(){
            val intent: Intent = Intent (this, PantallaInicio:: class.java)
            startActivity(intent)
        }
    }
}