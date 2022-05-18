package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.registro.*

class MainActivity2 : AppCompatActivity() {


    lateinit var handler: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        handler = DB(this)

        btnRegistrar.setOnClickListener(){
            handler.insertDB(0,this.Nombre.text.toString(),this.Email.text.toString(), this.contraseña.text.toString())
            Toast.makeText(this, "Registro guardado con exito", Toast.LENGTH_LONG).show()
        }


        regresarInicioSesion.setOnClickListener(){
            val intent: Intent = Intent (this, MainActivity:: class.java)
            startActivity(intent)
        }
    }



}