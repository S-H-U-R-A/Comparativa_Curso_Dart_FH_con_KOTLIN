package com.example.comparativafluttercursofh.control_02

fun main() {

    var continuar: String = "y";

    var contador: Int = 0;

    do { //Se usa cuando se quiere ejecutar el código al menos una vez
        contador++;
        println("Contador: $contador");
        println("¿Desea continuar? (y/n)");
        continuar =  readlnOrNull() ?: "n";
    } while ( continuar == "y" )

}