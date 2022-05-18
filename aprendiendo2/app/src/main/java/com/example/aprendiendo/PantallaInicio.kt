package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla_inicio.*

class PantallaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio)

        compraInsu.setOnClickListener(){
            val intent: Intent = Intent (this, CompraInsumos:: class.java)
            startActivity(intent)
        }

        insumos.setOnClickListener(){
            val intent: Intent = Intent (this, Insumos:: class.java)
            startActivity(intent)
        }

        presupuesto.setOnClickListener(){
            val intent: Intent = Intent (this, Presupuesto:: class.java)
            startActivity(intent)
        }

        venta.setOnClickListener(){
            val intent: Intent = Intent (this, Vender:: class.java)
            startActivity(intent)
        }
    }

}