package main

fun main() {
    val numeroPermitido = 1..100
    val numeroDeAcceso = 55  // Este número también podría ser proporcionado por el usuario

    if (numeroDeAcceso in numeroPermitido) {
        println("El número $numeroDeAcceso está dentro del rango permitido.")
    } else {
        println("El número $numeroDeAcceso no está dentro del rango permitido.")
    }
}
