package com.example.comparativafluttercursofh.control_02

fun main() {

    for (i in 0..9) {
        if (i == 5) {
            continue  //Si se cumple la condición, se salta el código que sigue y vuelve a ejecutar el ciclo
        }
        println(i)
        if (i == 2) {
            break //Si se cumple la condición, se sale del ciclo
        }
    }

}