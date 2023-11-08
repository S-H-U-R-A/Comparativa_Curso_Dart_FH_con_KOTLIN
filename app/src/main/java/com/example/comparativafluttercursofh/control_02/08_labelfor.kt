package com.example.comparativafluttercursofh.control_02

fun main() {

    /*
    *
    * Las anotaciones en Kotlin no solo aplican para Bucles, También sirven en funciones o en lambdas.
    *
    */

    outerLoop@ for (i in 0..4) { //En Dart se usa las etiquetas mediante el simbolo de :, outerLoop: for(j in 0 until 5)
        println("Valor de i: $i")
        innerLoop@ for (j in 0..4) { //En Dart se usa las etiquetas mediante el simbolo de :, innerLoop: for(j in 0 until 5)
            println("Valor de j: $j")
            if (j == 2) {
                break@outerLoop
            }
        }
    }
}