package com.example.comparativafluttercursofh.control_02

import kotlin.random.Random

fun main() {

    val rnd: Int = Random.nextInt(until = 7, from = 0)//El 7 indica hasta que número se puede generar el random sin incuirlo, comieza desde 0 incluyendolo

    val dia: String = when(rnd){ //si el bloque requiere más de una linea usamos las llaves {}
        0 -> "Lunes"
        1 -> "Martes"
        2 -> "Miércoles"
        3 -> "Jueves"
        4 -> "Viernes"
        5 -> "Sábado"
        6 -> "Domingo"
        else -> "Día no válido"
    }

    println("El día es: $dia")

}