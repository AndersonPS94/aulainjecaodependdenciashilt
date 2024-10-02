package com.example.aulainjecaodependenciashilt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.aulainjecaodependenciashilt.classes.Carro
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var carro: Carro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        carro.ligar()
    }
}