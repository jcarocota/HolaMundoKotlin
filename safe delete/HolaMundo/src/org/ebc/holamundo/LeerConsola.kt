package org.ebc.holamundo

fun main() {
    println("Introduce un texto aquí:")
    val texto = readln()

    println("El texto que escribiste es: $texto")

    // Leer un Int
    println("Introduce un número entero:")
    val numeroEntero = readln().toInt()
    println("Número entero ingresado: $numeroEntero")

    // Leer un Float
    println("Introduce un número flotante:")
    val numeroFlotante = readln().toFloat()
    println("Número flotante ingresado: $numeroFlotante")

    // Leer un Boolean
    println("Introduce true o false:")
    val valorBooleano = readln().toBoolean()
    println("Booleano ingresado: $valorBooleano")
}