package com.example.comparativafluttercursofh.tipos_nocomunes_04

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Exception
import kotlin.ArithmeticException
import kotlin.coroutines.CoroutineContext

fun multiLambda(
    x: Int,
    y: Int,
    callback: (result:Int)-> Unit
) {
    callback(x*y)
}

fun main() {

    /**
     * Exception handler, es nuestro método personalizado para manejar errores
     * Dependiendo del error que lanza  mostramos mensajes personalizados
     *
     */
    val exceptionHandler: CoroutineExceptionHandler = CoroutineExceptionHandler {
            coroutineContext: CoroutineContext, throwable: Throwable ->

        println("Error: $throwable \n En el hilo: $coroutineContext")

        if(throwable is ArithmeticException) println("Mostrar mensaje de error matematico")

    }

    CoroutineScope(
        context = Job() + exceptionHandler
    ).launch { //Ejemplo de captura de una excepción cualquiera
        delay(500)
        try{
            throw IndexOutOfBoundsException()
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    runBlocking {

        this.launch { //Ejemplo de captura de una excepción cualquiera
            try {
                delay(500)
                //throw Exception()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }



/*        CoroutineScope( //Acá tenemos un alcance personalizado con un manejador de excepciones personalizado
            context = Job() + exceptionHandler //Acá estamos usando nuestro manejador de errores personalizado
        ).launch {

            val result = async {
                delay(500)
                multiLambda(2, 3){  resultado ->
                    if(resultado > 5) throw ArithmeticException()
                }
            }
            println( "Result: ${ result.await() }")

        }*/
    }
}

/*void main(List<String> args) {

    Future<String> timeout = Future.delayed(
            Duration(seconds: 3),
    () {
        if(1==1){
            throw 'Auxilio!, explotó esta cosa';
        }
        return 'Retorno del future';
    }
    );

    timeout.then( print )
        .catchError( //Es importante que todos los Futures manejen los posibles errores
            print
        ); //El catchError es como el try catch de Kotlin

    print("Fin del main");

}*/

