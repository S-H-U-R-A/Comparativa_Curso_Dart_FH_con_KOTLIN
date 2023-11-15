package com.example.comparativafluttercursofh.tipos_nocomunes_04

import java.util.Queue


fun main() {

    val cola: MutableList<Int> = mutableListOf<Int>(); //En kotlin no existe el tipo de dato Queue, pero se puede simular con una lista mutable

    cola.addAll(
        listOf(
            10,20,30,40,50
        )
    );

    val i: Iterator<Int> = cola.iterator(); //Iterator es una interfaz que permite recorrer una lista

    while( i.hasNext() ){ //Si hay elementos continue, es similar a moveNext en Dart
        println( i.next() ); //next() es similar a current en Dart
    }

}
