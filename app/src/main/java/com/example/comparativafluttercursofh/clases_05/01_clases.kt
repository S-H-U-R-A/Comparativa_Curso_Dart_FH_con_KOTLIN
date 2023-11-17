package com.example.comparativafluttercursofh.clases_05

import com.example.comparativafluttercursofh.clases_05.clases.Persona


fun main() {

    val persona: Persona = Persona(bio = "Soy un desarrollador de software") //Instancia de la clase Persona

    val persona2: Persona = Persona(
        nombre = "Sergio",
        apellido = "Rodriguez",
        edad = 25,
        bio = "Soy un desarrollador de software"
    )


/*    persona.nombre = "Sergio"
    persona.edad = 25
    persona.bio = "Soy un desarrollador de software"*/

    /*persona.apply { //Está función de ámbito me permite configurar el objeto sin estar llamando a cada uno de sus campos
        //Por otra parte algo parecido para hacer esto en Dart podemos usar el operador de cascada (..)
        nombre = "Sergio"
        edad = 25
        //bio = "Soy un desarrollador de software"
    }*/

    //println(persona) //Imprime el objeto con su dirección de memoria si no se ha sobreescrito el método toString

    //println(persona.toString()) //Imprime a partir del método toString sobreescrito

    println(persona2)

}

/*
 -- Ejemplo de operador cascada de Dart para no tener que estar llamando el objeto constantemente para asignar sus propiedades

    final Persona persona = new Persona(); //Final cumple la misma funcionalidad que val en Kotlin

    persona
        ..nombre = "Fernando"
        ..edad = 33
        ..bio = "Nació por ahí";

*/
