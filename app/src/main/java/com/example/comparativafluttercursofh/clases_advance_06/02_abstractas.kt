package com.example.comparativafluttercursofh.clases_advance_06

/**
 * El uso de una clase abstracta es solo ser el cascaron para que
 * otras clases hereden de ella, por defecto las propiedades y métodos de una clase abstracta
 * son abstractos
 *
 * Normalmente las clases abstractas se usan para crear propiedades muy generales que serán heredadas
 * por otras clases, para el uso de métodos se recomienda usar interfaces
 *
 */

abstract class VehiculoAbstracto { //Por defecto las clases abstractas son open, al igual que los métodos y propiedades

    var encendido = false

    fun encender() {//Método con implementación por defecto
        encendido = true
        println("Vehículo encendido")
    }

    fun apagar() {//Método con implementación por defecto
        encendido = false
        println("Vehículo apagado")
    }

    abstract fun revisarMotor() : Boolean //método abstracto, que debe ser implementado por las clases que hereden de esta clase
}

class CarroAbstracto : VehiculoAbstracto() {

    var kilometraje = 0

    override fun revisarMotor(): Boolean {
        println("motor ok!")
        return true
    }

}

fun main() {

    val ford: CarroAbstracto = CarroAbstracto()

    ford.encender();

    ford.apagar();

    ford.revisarMotor();

}


/*

Ejecutar en Dart

abstract class Vehiculo {

    bool encendido = false;

    void encender() { //Método con implementación por defecto
        encendido = true;
        print('Vehículo encendido');
    }

    void apagar() { //Método con implementación por defecto
        encendido = false;
        print('Vehículo apagado');
    }

    bool revisarMotor(); //método abstracto, que debe ser implementado por las clases que hereden de esta clase
}

class Carro extends Vehiculo {
    int kilometraje = 0;

    @override bool revisarMotor() {
        print("motor ok!");
        return true;
    }

}

void main(List<String> args) {

    final Carro ford = Carro();

    ford.encender();

    ford.apagar();

    ford.revisarMotor();

}*/
