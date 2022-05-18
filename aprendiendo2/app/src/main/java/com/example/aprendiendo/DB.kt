package com.example.aprendiendo

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DB (context: Context): SQLiteOpenHelper(context, dbname,factory, version){


    companion object{
        internal val dbname = "sqlDB"
        internal val factory = null
        internal val version = 1
    }


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE user (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
        "nombre varchar(50),"+
        "email varchar(50),"+
        "password varchar(15))" )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun insertDB (id: Int,nombre: String, email: String,  password: String){
        val db:SQLiteDatabase = writableDatabase
        val values: ContentValues= ContentValues()

        values.put("id", id)
        values.put("nombre", nombre)
        values.put("email", email)
        values.put("password", password)
        db.insert("user", null,values)
        db.close()

    }

    fun searchDB(email: String, password: String): Boolean{
        val db: SQLiteDatabase = writableDatabase
        val query= "SELECT email,password FROM user where email = '${email}' and password = '${password}'"
        val cursor = db.rawQuery(query, null)


        if (cursor.count <= 0){
            cursor.close()
            return false
        }

        cursor.close()
        return true
    }



}