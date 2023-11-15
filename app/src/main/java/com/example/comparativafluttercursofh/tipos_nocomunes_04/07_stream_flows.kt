package com.example.comparativafluttercursofh.tipos_nocomunes_04

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.runBlocking

/**
 * Los Flows sería la contraparte de los Streams en Dart, es decir,
 * son flujos de datos asincronicos, que pueden tener varios consumidores si usamos sharedFlow
 *
 */

fun main() {

    val flowFrio: Flow<String> = flow {//Constructor de un flujo, es parecido a la forma de construir un Stream en Dart
        for(i: Int in 11..16) {

            if (i == 18) throw Exception("Houston, Tenemos un problema") //Se produce un error en el flujo, es parecido a sink.addError() en Dart

            delay(500)
            emit(i.toString()) //Se envian los datos al flujo, es parecido a sink.add() en Dart, pero se hace al momento de construir el flujo

        }
    }.shareIn(//Este flow compartido mejora el performance envitando tener que recolectar cuando los datos no cambian
        scope = GlobalScope,
        started = SharingStarted.Eagerly,
        replay = 1
    ) //shareIn() es parecido a broadcast() en Dart, solo que acá se optimiza compartiendo los datos entre los consumidores, en Dart se comparten los datos pero se ejecuta el flujo varias veces

    runBlocking {
        //Acá en Kotlin puedo tener varios consumidores del Flujo Frío sin hacer cambios adicionales, en Dart para tener varios consumidores de un Stream debemos usar el método broadcast() del StreamController
        //Sin embargo si quiero que se optimice el flujo, es decir, que se ejecute una sola vez mientras no se cambie los valores, debo usar el método shareFlow() del flujo
        flowFrio
            .catch {
                println("Error: $it") //It hace referecia al error Throwable que se produce en el flujo, en Dart sería el método onError() de Listen
            }
            .onCompletion {
                println("Misión completa") //Se dispara cuando se cierra el flujo, en Dart sería el método onDone() de Listen
            }
            .collect { //Se recorre el flujo, es parecido a usar el método listen() en Dart
                println(it)
            }

        flowFrio
            .catch {
                println("Error: $it") //It hace referecia al error Throwable que se produce en el flujo, en Dart sería el método onError() de Listen
            }
            .onCompletion {
                println("Misión completa") //Se dispara cuando se cierra el flujo, en Dart sería el método onDone() de Listen
            }
            .collect { //Se recorre el flujo, es parecido a usar el método listen() en Dart
                println(it)
            }
    }

}


/*

import 'dart:async';

*/
/**
 *
 * Los StreamsController son Asincronicos, es decir, son como los flujos de Kotlin,
 *
 *
 * Un stream puede tener varios listeners, es decir, varios listeners pueden estar escuchando un mismo stream si se usa el método Broadcast()
 *
 *//*


void main(List<String> args) {

    //final StreamController<String> streamController = new StreamController<String>(); //Se crea el StremController, sería parecdido a la forma de construir un Flujo de Kotlin

    final StreamController<String> streamController = new StreamController<String>.broadcast();//Para que podamos tener varios consumidores del stream debemos usar el método broadcast() del StreamController

    //Creamos el listener para los datos emitidos en el stream, es concepto es similar al de usar operaciones terminales en un flujo de Kotlin, sería como el método collect de Kotlin
    streamController.stream.listen(
        (data) => print("Despegando consumidor 1 $data"),
        onError: (error) => print("Error! $error"),
        onDone: () => print("Misión completa"), //Se dispara cuando se cierra el flujo mediante el método close()
        cancelOnError: false, //Si es true, cancela el flujo cuando se produce un error
    );

    streamController.stream.listen( //Segundo listener para el mismo stream
        (data) => print("Despegando consumidor 2 $data"),
        onError: (error) => print("Error! $error"),
        onDone: () => print("Misión completa"),
        cancelOnError: false,
    );

    streamController.sink.add("Apolo 11"); //Agregamos datos al stream mediante sink, es parecido a emit en un flujo de Kotlin

    streamController.sink.add("Apolo 12");

    streamController.sink.add("Apolo 13");

    streamController.sink.addError("Houston, Tenemos un problema"); //Agregamos un error al stream, este será capturado por onError del listener del stream

    streamController.sink.add("Apolo 14");

    streamController.sink.add("Apolo 15");


    streamController.sink.close(); //Cerramos el flujo, es parecido a cancelar un flujo de Kotlin mediante un Job.cancel(), esto se usa por ejemplo cuando se termina de leer un archivo, cerramos sesión, etc

    print("Fin del main");

}*/
