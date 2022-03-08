package com.example.encryptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var wprowadzonyTekst: TextInputEditText = findViewById(R.id.tekstInput)
    var wychodzacytekst: TextView = findViewById(R.id.tekst)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        klikPrzycisk1()
    }

    fun klikPrzycisk1() {

        val przycisk1: Button = findViewById(R.id.przycisk1)

        przycisk1.setOnClickListener {
            var rotacja = ""

            val charPool: List<Char> = ('a'..'z') + ('A'..'Z')
            wprowadzonyTekst.forEach {
                rotacja = rotacja.plus((it.toChar(any = "").hashCode()).toString().length)
                rotacja = rotacja.plus(it.toChar(any = "").hashCode())
                val randomString = (1..Random.nextInt(0, 3))
                    .map { i -> Random.nextInt(0, charPool.size) }
                    .map(charPool::get)
                    .joinToString("");
                rotacja = rotacja.plus(randomString)
            }
            rotacja = rotacja.reversed()
            wychodzacytekst = findViewById(R.id.tekst)
            wychodzacytekst.text = rotacja
        }

    }


    private fun TextInputEditText.forEach(function: () -> Unit) {

    }

    fun czyszczenie() {
        wychodzacytekst = findViewById(R.id.tekst)
        wychodzacytekst.text = ""
    }

}

private fun Any.toChar(any: Any): Any {
return any
}
