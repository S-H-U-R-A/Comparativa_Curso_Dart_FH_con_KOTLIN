package com.example.comparativafluttercursofh.funciones_05

fun saludarBasico(
    mensaje: String,
    nombre: String = "Sin Nombre" //En Kotlin para decir que un parámetro es opcional, se le asigna un valor por defecto
) : Unit {
    print("$mensaje $nombre");
}

//En Kotlin se pueden pasar argumentos variables a una función, para ello se usa la palabra reservada vararg
//vararg es como un array y es parecido a spread operator de Dart
fun saludarConArgumentosVariables(nombre: String, vararg datosAdicionales: String) : Unit {

    print("Hola $nombre \t")

    datosAdicionales.forEach { dato ->
        print("$dato \t")
    }

}

fun saludarConArgumentosNombrados(
    mensaje: String,
    nombre: String,
    veces: Int
) : Unit {
    println("Saludar con argumentos con nombres $mensaje $nombre - $veces");
}



fun main() : Unit {

    saludarBasico("Hola")

    //Enviamos el nombre y como un arreglo los parámetros opcionales
    saludarConArgumentosVariables(nombre = "Sergio", datosAdicionales = arrayOf("Andrés", "Rodríguez", "Bautista") )

    //Otra forma de enviar los datos si ya tenemos un arreglo es anteponerle el simbolo de * antes del nombre al pasarlo como argumento
    val datosAdicionales: Array<String> = arrayOf("Andrés", "Rodríguez", "Bautista")

    saludarConArgumentosVariables(nombre = "Sergio", datosAdicionales = *datosAdicionales)

    //Otra forma es enviar los datos 1 a 1 de la siguiente manera, implicitamente se convierte en un arreglo
    saludarConArgumentosVariables(nombre = "Sergio",  "Andrés", "Rodríguez", "Bautista")

    //Para usar argumentos por nombre en kotlin es tan simple como
    // anteponer el nombre del parámetro y el valor que se le quiere asignar
    //Esto nos permite pasar los parámetros en el orden que queramos
    saludarConArgumentosNombrados(nombre = "Sergio", mensaje = "Hola", veces = 10)


}