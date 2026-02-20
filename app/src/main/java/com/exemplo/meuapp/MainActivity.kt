package com.exemplo.meuapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "Olá! Meu app está funcionando 🚀"
        textView.textSize = 20f

        setContentView(textView)
    }
}
