package com.example.aulainjecaodependenciashilt.di

import android.content.Context
import com.example.aulainjecaodependenciashilt.classes.Bateria
import com.example.aulainjecaodependenciashilt.classes.Carro
import com.example.aulainjecaodependenciashilt.classes.Instrumento
import com.example.aulainjecaodependenciashilt.classes.Motor
import com.example.aulainjecaodependenciashilt.classes.MotorDeEletricidade
import com.example.aulainjecaodependenciashilt.classes.MotorDeGasolina
import com.example.aulainjecaodependenciashilt.classes.Musico
import com.example.aulainjecaodependenciashilt.classes.Violao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object AppModulo {

    @Provides
    fun proverMusico(@Named("Violao") instrumento: Instrumento): Musico {
        return Musico(instrumento)
    }

    @Provides
    @Named("Violao")
    fun proverViolao(): Instrumento {
        return Violao()
    }

    @Provides
    @Named("Bateria")
    fun proverBateria(): Instrumento {
        return Bateria()
    }

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