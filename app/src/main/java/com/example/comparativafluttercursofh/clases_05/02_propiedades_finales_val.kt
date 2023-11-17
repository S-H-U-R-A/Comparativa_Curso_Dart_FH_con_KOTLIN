package com.example.comparativafluttercursofh.clases_05


class Cuadrado(
    val lado: Int,
){

    val area: Int = this.lado * this.lado //Esta es la forma corta de asignar un valor a val a partir de otro valor en el constructor

    //Esta sería una forma de poder asignar un valor a una propiedad val en kotlin, usando el bloque init
    val area2: Int;  //Esto es una propiedad constante despues que reciba su primer valor, es similar a Final en Dart.

    init {
        this.area2 = this.lado * this.lado
    }

}

/*

class Cuadrado2 {
    final int lado; //Propiedad final, es como una constante, pero se puede inicializar en el constructor
    final int area; //En kotlin su equivalencia sería usar val

    //Constructor

    //Esta forma de hacer una inicialización de una propiedad final mediante el constructor, no existe en kotlin, en kotlin usamos Init{}
    Cuadrado(this.lado) : area = lado * lado; //Acá se inicializa la propiedad area a partir de la propiedad lado, esto es posible porque las propiedades finales se pueden inicializar en el constructor
}

void main(List<String> args) {}*/
