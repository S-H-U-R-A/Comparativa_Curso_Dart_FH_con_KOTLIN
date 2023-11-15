package com.example.comparativafluttercursofh.funciones_03

/**
 * Las lambdas son una forma concisa de expresar una función anónima/función sin nombre.
 *
 * Se usan sobre las funciones anónimas cuando el bloque de código es pequeño y conciso.
 *
 */

fun main() {

    val saludar: () -> Unit = //Esta sería una variable que tiene la capacidad de almacenar una función, por eso podemos decir que es de tipo de la firma de la función
        { //Esto sería el cuerpo de la función
            println("Hola mundo")
        }

    saludar() //Llamamos a la lambda

    val resultado: Int = sumarAbreviado(10, 20)

    println(resultado)

    val listado: List<Int> = listOf(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 10, 1);

    //Esta sería la forma parecida a Dart, solo que en Dart la flecha es con el simbolo de "=" y se debe especificar la palabra return
    val nuevoListado: List<Int> = listado.filter (
        { numero ->
            numero > 4//En kotlin la última linea de código es el retorno de la función
        }
    )

    val nuevoListado2: List<Int> = listado.filter{
            numero -> numero > 4
    } //Esta sería la forma abreviada de la función anterior


}

fun sumar(x: Int, y: Int): Int {
    return x + y
}

//En Dart a esta forma abreviada de escribir funciones se le conoce como arrow function
fun sumarAbreviado(x: Int, y: Int): Int = x + y //Si la función solo tiene una linea de código, podemos omitir el return y las llaves