package com.example.comparativafluttercursofh.clases_05

/**
 * Herramientas
 *
 * Acá en kotlin para replicar o simular el funcionamiento de Static usamos companion object,
 * que es lo mismo que static.
 *
 */

class Herramientas {

    companion object /*Puede tener un nombre*/ {

        private val listado: List<String> = listOf("Martillo", "Llave Inglesa", "Desarmador")

        fun imprimirListado(): Unit = listado.forEach(::println)

    }

}


fun main() {

    Herramientas.imprimirListado()
}



/**
 * Static significa que puedo acceder a la propiedad o método sin necesidad de crear una instancia de la clase, ahora bien en Kotlin no existe la palabra reservada static, pero si existe la palabra reservada companion object, que es lo mismo que static, pero con la diferencia que en Kotlin se puede acceder a propiedades y métodos privados, cosa que en Dart no se puede.
 *
 *
 * En kotlin todo lo que este en las llaves del companion object es estático, y se puede acceder a sus propiedades y métodos sin necesidad de crear una instancia de la clase.
 *
 */

/*
class Herramientas {

    //Const hace que la lista sea inMutable, es decir, que no se pueda modificar, pero si se puede acceder a sus elementos
    static const List<String> listado = ['Martillo', 'Llave Inglesa', 'Desarmador'];

    static void imprimirListado() => listado.forEach(print);

}


void main(List<String> args) {

    //Herramientas.listado.add('Tenazas'); //No se puede porque es una propiedad estática y constante, por lo que no se puede modificar

    Herramientas.imprimirListado();

}*/
