package com.example.comparativafluttercursofh.basico_01

fun main() {

    val a: Int? = null; // Operador de asignación

    val b: Int = 20;

    //Operadores condicionales
    var numero: Int? = null;

    numero = 23

    //val resp: String = if(numero > 25) "C es mayor a 25" else "C es menor a 25";

    val d: Int = numero ?: a ?: b

    //println(d)

    // Operador de tipo
    val i: Int = 10;
    val j: Any = "10";


    println( (i is Int) ); //Usando is puedo saber si una variable es de un tipo de dato en especifico, funciona igual en Kotlin

    println(j !is Int);



}