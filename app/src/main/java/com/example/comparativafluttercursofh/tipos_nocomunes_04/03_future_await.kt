package com.example.comparativafluttercursofh.tipos_nocomunes_04

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    println("Inicio del programa")

    val futureDeferred: Deferred<String> = async(Dispatchers.IO) {
        delay(3000)
        println("3 segundos después")
        "Retorno del future Deferred"
    }

    println(
        "Fin del async: ${ 
            futureDeferred.await() 
        }" //Esta linea pausa toda la ejecución
    )

    println("Fin del main")

}