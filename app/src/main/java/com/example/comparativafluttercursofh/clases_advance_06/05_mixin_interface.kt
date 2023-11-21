package com.example.comparativafluttercursofh.clases_advance_06

import java.text.SimpleDateFormat
import java.util.Calendar


/**
 *
 * En kotlin no existe el concepto de Mixin, pero se puede simular con interfaces con métodos por defecto
 *
 * Acá en este ejemplo se muestran ejemplos de uso de las Interfaces con métodos por defecto
 *
 */


interface MixinLogger {

    fun imprimir(texto: String) {
        val calendario = Calendar.getInstance()
        val formatter = SimpleDateFormat("dd/MM/yyyy")
        val hoy = formatter.format(calendario.time) //Se obtiene la fecha actual y se formatea como deseamos
        println("$hoy :::: $texto")
    }

    fun saludar() : Unit

}

interface MixinLogger2 {

    fun imprimir2(texto: String) {
        val calendario = Calendar.getInstance()
        val formatter = SimpleDateFormat("dd/MM/yyyy")
        val hoy = formatter.format(calendario.time) //Se obtiene la fecha actual y se formatea como deseamos
        println("$hoy :::: $texto")
    }

}

//Clase abstracta que implementa la interfaz MixinLogger y MixinLogger2
//No se obliga a implementar el método abstracto saludar de la interfaz MixinLogger
//Delegandose su implementación a las clases concreteas que hereden de esta clase abstracta
abstract class Astro : MixinLogger, MixinLogger2 {

    var nombre: String? = null

    init {
        imprimir("-- Init del Astro --")
    }

    fun existo() {
        imprimir("-- Soy un ser celestial y existo --")
    }

}

class Asteroide(
    nombre: String
) : Astro() {

    init {
        this.nombre = nombre // Se asigna un valor a la propiedad nombre de la clase abstracta Astro
        imprimir("Soy $nombre")
    }

    //Se implementa el método abstracto saludar de la interfaz MixinLogger, heredado de la clase abstracta Astro
    override fun saludar() {
        print("Hola soy un asteroide")
    }

}

fun main() {

    val ceres: Asteroide = Asteroide("Ceres")

    ceres.existo() //Se llama al método existo de la clase abstracta Astro

    ceres.saludar() //Se llama al método saludar de la clase abstracta Astro, que a su vez llama al método saludar de la interfaz MixinLogger

}


/*
mixin Logger {

    void imprimir(String texto) {
        final hoy = DateTime.now(); //Se obtiene la fecha actual
        print('$hoy :::: $texto');
    }

}

mixin Logger2 {

    void imprimir2(String texto) {
        final hoy = DateTime.now(); //Se obtiene la fecha actual
        print('$hoy :::: $texto');
    }

}

abstract class Astro with Logger, Logger2 { //Se usa la palabra reservada with para indicar que se va a usar un mixin

    String? nombre;

    Astro() {
        imprimir('-- Init del Astro --');
    }

    void existo() {
        imprimir('-- Soy un ser celestial y existo --');
    }

}

class Asteroide extends Astro {

    Asteroide(
        String nombre
    ) {
        this.nombre = nombre; // Se asigna un valor a la propiedad nombre de la clase abstracta Astro
        imprimir("Soy $nombre");
    }

}




void main(List<String> args) {

    final Asteroide ceres = Asteroide('Ceres');


}*/
