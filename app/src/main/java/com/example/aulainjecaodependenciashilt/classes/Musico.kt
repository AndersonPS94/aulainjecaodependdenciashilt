package com.example.aulainjecaodependenciashilt.classes

import android.util.Log

class Musico (
    private val instrumento: Instrumento
){
    fun tocar(){

        Log.i("teste_hilt", "Musico tocando")
        instrumento.sendoTocado()
    }

}

interface Instrumento{
    fun sendoTocado()

}

class Violao: Instrumento{
    override fun sendoTocado(){

    }
}

class Bateria : Instrumento{
    override fun sendoTocado(){
        Log.i("teste_hilt", "Bateria sendo tocado")
    }
}