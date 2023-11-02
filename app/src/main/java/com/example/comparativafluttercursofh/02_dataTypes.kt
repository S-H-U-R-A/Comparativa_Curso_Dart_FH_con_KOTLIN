package com.example.comparativafluttercursofh

fun main() {

    // ===== Maps ===== Diccionarios / Objetos literales
    val mapa: MutableMap<String, Any> = mutableMapOf(
        "name" to "Tony stark",
        "poder" to "inteligencia y dinero",
        "nivel" to 9000
    )

    println(
        "El nombre es ${mapa["name"]}, " +
        "el poder es ${mapa["poder"]}, " +
        "el nivel es ${mapa["nivel"]}"
    );

    mapa.putAll(
        mapOf(
            "name" to "Peter Parker",
            "poder" to "sentido aracnido",
            "nivel" to 100
        )
    )

    println(mapa);

}