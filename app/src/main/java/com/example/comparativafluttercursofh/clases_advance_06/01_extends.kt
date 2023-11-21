package com.example.comparativafluttercursofh.clases_advance_06


//Por defecto las clases en Kotlin son finales y no se pueden heredar, para cambiar esto se debe usar la palabra reservada open
open class Vehiculo(
    var encendido : Boolean = false, //Las propiedades las podemos inicializar en el constructor primario
    open var color : String = "Blanco" //Las propiedades que queremos que sean heredadas deben ser marcadas como open
) {

    fun encender() {
        encendido = true
        println("Vehículo encendido")
    }

    fun apagar() {
        encendido = false
        println("Vehículo apagado")
    }

    override fun toString(): String {
        return "Vehiculo(encendido=$encendido, color='$color')"
    }

}

//Carro hereda las propiedades y métodos de la clase Vehiculo
class Carro(
    override var color: String = "Rojo" //Para sobreescribir una propiedad heredada se usa la palabra reservada override
) : Vehiculo( //Para heredar de una clase se usa el símbolo de dos puntos y el nombre de la clase de la que se quiere heredar
    color = color //Para pasar el valor de la propiedad color al constructor de la clase padre se usa el mismo nombre de la propiedad
) {

    var kilometraje = 0

}

fun main() {

    val ford: Carro = Carro()

    ford.encender()

    ford.apagar()

    println(ford.toString())

}


/*

Ejemplo en Dart

class Vehiculo {

    bool encendido = false;

    void encender() {
        encendido = true;
        print('Vehículo encendido');
    }

    void apagar() {
        encendido = false;
        print('Vehículo apagado');
    }
}

class Carro extends Vehiculo {

    int kilometraje = 0;

}



void main(List<String> args) {

    final Carro ford = Carro();

    ford.encender();

    ford.apagar();

}*/
