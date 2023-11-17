package com.example.comparativafluttercursofh.clases_05.clases

//Ejemplo de un singleton básico
class MiServicio2 private constructor() {

    var url: String = "https://abc.com"
    var key: String = "ABC123"

    companion object { //Objeto compañero, es como un singleton, pero con la diferencia que puedo acceder a sus propiedades y métodos sin necesidad de instanciar la clase
        val miServicio: MiServicio2 = MiServicio2()
    }

}

//Este es otro ejemplo más completo de un singleton, usando una sincronización que evite errores de acceso.
class MiServicio1 {

    var url: String = "https://abc.com"
    var key: String = "ABC123"

    companion object { //Objeto compañero, es un singleton, debido a ser estatico entoces puede consevar el valor de la instacia de la clase en memoria

        @Volatile private var instance: MiServicio1? = null //Variable que sirve para mantener la instancia de la clase en memoria, al estar en un companion object es estaico

        fun getInstance() : MiServicio1 =
            instance ?: synchronized(this) { //Sincroniza el acceso a la variable instance, para que no ocurran errores al momento de querer un objeto de esta clase
                instance ?: MiServicio1().also { miClase ->
                    instance = miClase
                }
            }
    }
}

//Si queremos un singleton en su forma más básica, podemos usar un objeto, ya que por defecto es un singleton
object MiServicio {

    var url: String = "https://abc.com"
    var key: String = "ABC123"

}



/*

EJEMPLO DE DART

class MiServicio {

    String url = 'https://abc.com';

    String key = 'ABC123';

    static final MiServicio _singleton = new MiServicio._internal(); //Variable que sirve para mantener la instancia de la clase en memoria, a ser static y final solo se puede inicializar una vez

    factory MiServicio() { //Constructor factory que regresa una instancia de la clase
        return _singleton;
    }

    MiServicio._internal(); //constructor privado que genera una instancia de la clase

}

*/

/**
 *
 * Cosas a tener en cuenta al hacer un Singleton:
 *
 * 1. Una variable privada de tipo final y static de tipo de la clase, que sirve para mantener la instancia de la clase.
 *
 * 2. Un constructor factory que regresa una instancia de la clase.
 *
 * 3. Un constructor con nombre que sea privado que generará una instancia de la clase.
 *
 */