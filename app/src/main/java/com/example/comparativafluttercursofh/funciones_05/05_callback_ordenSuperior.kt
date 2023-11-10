package com.example.comparativafluttercursofh.funciones_05

fun main() {

    obtenerUsuario( "100", { persona: Map<String, String> -> //Lambda llamada desde la misma función
        print(persona);
    });

    obtenerUsuario( "100") { persona: Map<String, String> ->//Lambda llamada desde afuera de la función, gracias a kotlin.
        print(persona);
    };

}

//Función de orden superior, es decir una función que recibe una función como parámetro
fun obtenerUsuario(id: String, callback: ( Map<String, String> ) -> Unit) {
    val usuario: Map<String, String> = mapOf(
        "id" to id,
        "nombre" to "Sergio Andrés"
    )
    callback(usuario);
}

