package com.example.comparativafluttercursofh.tipos_nocomunes_04

/**
 * Las enumeraciones facilitan la lectura del código
 *
 * Son usadas para cuando necesitamos representar tipos, ejemplo:
 *
 * Dias de la semana,
 * Tipos de equipaje,
 * Tipos de productos,
 * Representar categorias,
 * Tipos de estados de respuestas http,
 * Colores,
 * Representar opciones de seleeción
 * Envolver clases anomimas
 * Etc...
 */

enum class Audio(val frecuencia: String) { //Las enum en Kotlin se pueden tratar como clases, es decir pueden tener propiedades y métodos
    BAJO( frecuencia = "20Hz" ),
    MEDIO( frecuencia = "50Hz" ),
    ALTO( frecuencia = "100Hz" )
}

fun main() {

    val volumen: Audio = Audio.MEDIO

    Audio.values().forEach { audio ->
        println(audio.frecuencia) //Podemos acceder a las propiedades de la enum
    }

    println()

    when(volumen){
        Audio.BAJO -> {
            print("Volumen bajo")
        }
        Audio.MEDIO -> {
            print("Volumen medio")
        }
        Audio.ALTO -> {
            print("Volumen alto")
        }
    }

}
