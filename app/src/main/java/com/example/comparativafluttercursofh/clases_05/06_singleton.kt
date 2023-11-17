package com.example.comparativafluttercursofh.clases_05

import com.example.comparativafluttercursofh.clases_05.clases.MiServicio


fun main() {

/*    val spotifyService1: MiServicio = MiServicio.miServicio
    spotifyService1.url = "https://api.spotify.com"

    val spotifyService2: MiServicio = MiServicio.miServicio
    spotifyService2.url = "https://api.spotify.com/v2"*/

/*    val spotifyService1: MiServicio = MiServicio.getInstance()
    spotifyService1.url = "https://api.spotify.com"

    val spotifyService2: MiServicio = MiServicio.getInstance()
    spotifyService2.url = "https://api.spotify.com/v2"*/

    val spotifyService1: MiServicio = MiServicio
    spotifyService1.url = "https://api.spotify.com"

    val spotifyService2: MiServicio = MiServicio
    spotifyService2.url = "https://api.spotify.com/v2"

    println(spotifyService1 == spotifyService2) //falso o true si se esta usando el patron singleton

}

/*

EJEMPLO EN DART

void main(List<String> args) {

    final spotifyService1 = new MiServicio();
    spotifyService1.url = 'https://api.spotify.com';

    final spotifyService2 = new MiServicio();
    spotifyService2.url = 'https://api.spotify.com/v2';

    print(spotifyService1 == spotifyService2); //falso o true si se esta usando el patron singleton


}*/
