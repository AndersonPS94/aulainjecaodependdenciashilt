package com.example.aulainjecaodependenciashilt.classes

import android.util.Log

interface Motor {
    fun acionar()
}

class MotorDeGasolina() : Motor {
    override fun acionar() {
        Log.i("teste_hilt", "motor ligaddo a gasolina")    }
}

class MotorDeEletricidade : Motor {
    override fun acionar() {
        println("Motor de eletricidade acionado.")
    }
}