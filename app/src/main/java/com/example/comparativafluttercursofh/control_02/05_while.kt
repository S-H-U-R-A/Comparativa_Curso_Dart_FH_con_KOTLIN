package com.example.comparativafluttercursofh.control_02

fun main() {

    var continuar: String = "y";

    var contador: Int = 0;

    while ( continuar == "y" ) {

        contador++;
        println("Contador: $contador");
        println("¿Desea continuar? (y/n)");
        continuar =  readlnOrNull() ?: "n";

    }

}