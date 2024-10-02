package com.example.aulainjecaodependenciashilt.di

import android.content.Context
import com.example.aulainjecaodependenciashilt.classes.Carro
import com.example.aulainjecaodependenciashilt.classes.Motor
import com.example.aulainjecaodependenciashilt.classes.MotorDeEletricidade
import com.example.aulainjecaodependenciashilt.classes.MotorDeGasolina
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModulo {

    @Provides
    fun proverCarro(motor: Motor, @ApplicationContext context: Context): Carro {
        return Carro(motor, context)
    }

    @Provides
    fun proverMotor(): Motor {
        //return MotorDeGasolina()
        return MotorDeEletricidade()

    }
}