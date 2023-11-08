package com.example.comparativafluttercursofh.control_02

fun main() {

/*    for (i in 0..9) {
        print(i)
    }*/

    println("Ingrese el número de  la tabla a multiplicar")
    var tabla: Int = (readlnOrNull() ?: "5").toIntOrNull() ?: 5

    for( i: Int in 0..10 step 1){
        println( "$tabla * $i = ${ tabla * i}" )
    }


}