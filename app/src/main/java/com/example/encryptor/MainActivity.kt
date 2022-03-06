package com.example.encryptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  //  lateinit var tekst: TextView
  //  lateinit var przycisk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //   inicjalizacja()

        klik()


    }

fun inicjalizacja(){
  //  tekst = findViewById(R.id.tekst)
 //   przycisk = findViewById(R.id.przycisk)
}

    fun klik(){
        val tekst: TextView = findViewById(R.id.tekst)
        val przycisk: Button = findViewById(R.id.przycisk)

        przycisk.setOnClickListener {
            tekst.setText("test")
        }
    }



}