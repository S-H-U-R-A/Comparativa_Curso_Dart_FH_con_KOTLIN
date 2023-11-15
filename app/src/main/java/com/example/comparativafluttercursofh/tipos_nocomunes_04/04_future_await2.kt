package com.example.comparativafluttercursofh.tipos_nocomunes_04

import android.content.Context
import android.os.Environment
import android.provider.ContactsContract.Directory
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() = runBlocking{
        //NO SE HACE ESTE EJEMPLO PORQUE LITERALMENTE
        //ES LO MISMO QUE EL ANTERIOR
}


/*
void main(List<String> args) {

    File file = new File(
        Directory.current.path + "\\04_tipos_nocomunes\\assets\\personas.txt");

    Future<String> f = file
            .readAsString(); //Este método devuelve un Future, es decir, una tarea asincrona que se resolverá en el futuro

    f.then(print); //El then es como el await de Kotlin

    print("Fil del Main");


}*/
