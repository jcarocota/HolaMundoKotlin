package main

fun main() {
    // Leer un String
    println("Introduce un texto:")
    val texto = readln()
    println("Texto ingresado: $texto")

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
