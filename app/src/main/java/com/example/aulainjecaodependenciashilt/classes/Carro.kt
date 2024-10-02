package com.example.aulainjecaodependenciashilt.classes

import android.content.Context
import android.util.Log
import android.widget.Toast

class Carro(
    val motor: Motor,
    val contexto: Context
) {


    fun ligar(){
        motor.acionar()
        Toast.makeText(contexto, "Carro ligado", Toast.LENGTH_SHORT).show()
        Log.i("teste_hilt", "carro ligado")
    }
}