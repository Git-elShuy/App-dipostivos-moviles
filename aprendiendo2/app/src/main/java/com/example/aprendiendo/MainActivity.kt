package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    lateinit var handler: DB


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        btnCrearCuenta.setOnClickListener(){
            val intent: Intent = Intent (this, MainActivity2:: class.java)
            startActivity(intent)
        }



        handler = DB(this)

        btnLogin.setOnClickListener(){
            if (handler.searchDB(this.EmailIngresado.text.toString(), this.passwordIngresada.text.toString())){
                Toast.makeText(this, "se logeo bien", Toast.LENGTH_LONG).show()

                val intent: Intent = Intent (this, PantallaInicio:: class.java)
                startActivity(intent)
            } else{
                Toast.makeText(this, "fallo al logear", Toast.LENGTH_LONG).show()
                val intent: Intent = Intent (this, Vender:: class.java)
                startActivity(intent)
            }
        }
    }
}
