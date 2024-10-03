package com.example.aulainjecaodependenciashilt.di

import com.example.aulainjecaodependenciashilt.classes.Banda
import com.example.aulainjecaodependenciashilt.classes.Instrumento
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named


@Module
@InstallIn(SingletonComponent::class)
object AppModuloInstrumento {

    @Provides
    fun proverBanda(
        @Named("Violao") violao: Instrumento,
        @Named ("Bateria") bateria: Instrumento
    ) : Banda {
        return Banda(violao, bateria)

    }
}