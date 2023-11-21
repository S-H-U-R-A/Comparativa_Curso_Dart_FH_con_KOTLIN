package com.example.comparativafluttercursofh.clases_advance_06

/**
 * En este ejemploo se muestra como pasarle argumentos al constructor de la clase padre desde las clases hijas
 *
 * EN kotlin es más sencillo que en Dart, ya que no es necesario declarar las propiedades de la clase
 * y no se debe llamar a super() para inicializar el constructor de la clase padre,
 * debido a que esto se hace en la misma declaración de la herencia de clase
 *
 */
open class Persona( //En kotlin es más sencillo que en Dart, ya que no es necesario declarar las propiedades de la clase
    val nombre: String,
    val edad: Int
) {
    fun imprimirNombre() = println("Nombre: $nombre, Edad: $edad")

}

class Cliente constructor( //Al no poner las propiedades como val o var, estas solo serán usadas para inicializar el constructor del padre
    edadActual: Int,
    nombreActual: String
) : Persona( //Esta es la forma de inicializar el constructor de la clase padre, en Kotlin
    nombre = nombreActual,
    edad = edadActual
) {

    var direccion: String? = null
    var ordenes = listOf<String>()

}

fun main() {

    val pedro: Persona = Cliente(33, "Pedro")

    pedro.imprimirNombre();

}

/*

Ejemplo en Dart

class Persona {

    String nombre;
    int edad;

    Persona(this.nombre, this.edad);//Argumentos obligatorios, que se asignan a las propiedades de la clase

    void imprimirNombre() => print('Nombre: $nombre, Edad: $edad');

}

class Cliente extends Persona {

    String? direccion;
    List ordenes = [];

    //Esta es la forma de inicializar el constructor de la clase padre, en Kotlin
    Cliente(int edadActual, String nombreActual) :
    super(nombreActual, edadActual);

}


void main(List<String> args) {

    final Persona pedro = Cliente(33, "Pedro");

    pedro.imprimirNombre();

}*/
