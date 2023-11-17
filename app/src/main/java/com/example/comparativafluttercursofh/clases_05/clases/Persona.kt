package com.example.comparativafluttercursofh.clases_05.clases

/**
 * Getter y Setter en Kotlin se definen de forma automática por lo que no es necesario declararlos
 * a menos que se requiera hacer algo en especial en ellos
 *
 *
 * Si se esta buscando una clase que actue como POJO(Plain Old Java Object) se puede usar
 * mejor un data class{}, que ya esta especializada en este tipo de clases
 *
 * El constructor primario tiene su cuerpo mediante la lambda del método init{}
 *
 */

class Persona constructor( //Este es el constructor primario, el cual se puede omitir si no se requiere hacer nada en el
    //El el caso de Kotlin los campos de la clase se pueden definir en el mismo constructor por practicidad y en automatico crea getter y setters
    var nombre: String? = null,
    var edad: Int? = null,
    var bio: String? = null,
    property: String = "", //En este caso se puede recibir o no el valor en el constructor y después asignarlo, sin embargo es más corto hacer
    //la declaración de la variable en el constructor
) {
    // Campos o propiedades
    private var property: String? = property //Se establece esta propiedad como privada

    // Get y sets
    //En kotlin el uso de getters y setters es opcional, ya que se definen de forma automática
    //Sin embargo si se requiere hacer algo en especial en ellos se pueden declarar de forma manual
    private var _bio: String = ""
        get() = field //Así definimos un getter personalizado o con llaves si necesitamos más de una linea de código
        private set(value) { //Así se definiría un setter personalizado, y tenemos el ejemplo de cambiar siu visibilidad
            field = value //Acá podriamos hacer algo más con el valor que se esta asignando
        }

    private var _edad: Int = 15
        get() = field //Así se puede acceder al valor de la propiedad, para devolver el valor de la propiedad
        set(value) {
            if(value > 18) {
                field = value//Field es un campo de respaldo que se puede usar para acceder al valor de la propiedad que ya este establecido
            }
        }


    // Constructores

    //Lo primero que hay que tener claro es que el constructor primario es el que se declara en la firma de la clase y su
    //cuerpo se define en la lambda del método init{}
    init {
        println("Hola mundo") //Esto se ejecuta al momento de instanciar la clase, siendo el cuerpo del constructor primario
    }

    //El constructor secundario se declara con la palabra constructor y su cuerpo se define en el mismo
    //Este constructor debe delegar al constructor primario mediante : this()
    //Si existe un método init{} en el constructor primario, este se ejecuta antes del constructor secundario
    constructor(
        nombre: String,
        apellido: String, //En este caso se puede recibir o no el valor en el constructor y después asignarlo, sin embargo es más corto hacer
        edad: Int,
        bio: String,
    ): this(nombre, edad, bio, "") {
        //En este caso se llama al constructor primario para que se encargue de asignar los valores
        //Si se requiere hacer algo en el constructor secundario se puede hacer en el cuerpo de este
    }


    // Métodos
    override fun toString(): String = "Nombre: $nombre, Edad: $edad, Bio: $bio"

}
