package com.example.comparativafluttercursofh.funciones_03


//Por default en Koltin cuando pasamos un objeto a una función se pasa por referencia,
// es decir, si modificamos el objeto dentro de la función, este se modifica en el contexto global
fun capitalizarMapa(mapa: MutableMap<String, String>): MutableMap<String, String> {

    val copiaDelMapa: MutableMap<String,String> = mapa.toMutableMap() //Esta sería una forma de romper la referencia

    copiaDelMapa["nombre"] = copiaDelMapa["nombre"]?.uppercase() ?: "No hay nombre"; //Si el nombre no es nulo lo vuelve mayusculas y si es nulo le asigna el valor de 'No hay nombre'

    return copiaDelMapa;


/*    val mapaCopia = mapa + emptyMap()

    // Realizar las modificaciones necesarias en la copia
    val nombre = mapaCopia["nombre"]?.uppercase() ?: "No hay nombre"
    val mapaModificado = mapaCopia + ("nombre" to nombre)

    return mapaModificado*/
}

fun main(args: Array<String>) {

    val persona: MutableMap<String, String> =  mutableMapOf("nombre" to "Tony Stark");

    val persona2: MutableMap<String,String> = capitalizarMapa(persona)

    println(persona);
    println(persona2);

}