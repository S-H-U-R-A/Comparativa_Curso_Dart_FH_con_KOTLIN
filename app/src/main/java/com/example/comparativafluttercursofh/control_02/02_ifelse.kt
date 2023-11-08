package com.example.comparativafluttercursofh.control_02

fun main() {

    val edad: Int = Integer.parseInt( (readlnOrNull() ?: '0').toString() )

    val respuesta: String =  if(edad >= 21) {
        "Ciudadano"
    } else if (edad >= 18) {
        "Mayor de edad"
    } else {
        "Menor de edad"
    }

    println(respuesta)

}