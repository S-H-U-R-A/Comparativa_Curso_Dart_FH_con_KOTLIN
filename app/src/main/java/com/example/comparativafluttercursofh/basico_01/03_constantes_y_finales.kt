package com.example.comparativafluttercursofh.basico_01

// ===== Constante de compilación =====
const val PI: Double = 3.1416; //Valor constante que se conoce en tiempo de compilación

private lateinit var nombre: String; //lateinit es una variable que se inicializa despues de su declaración, en algún momento antes de su uso

fun main() {

    val a: Int? = null; //var es mutable, es decir su valor puede cambiar.

    val b: Int = 20; //Val es una constante inmutable, no puede ser reasignada despues de su asignación en tiempo de ejecución

}