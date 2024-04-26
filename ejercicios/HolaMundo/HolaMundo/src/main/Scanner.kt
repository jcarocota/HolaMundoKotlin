package main

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Leer un String
    println("Introduce un texto:")
    val texto = scanner.nextLine()
    println("Texto ingresado: $texto")

    // Leer un Int
    println("Introduce un número entero:")
    val numeroEntero = scanner.nextInt()
    println("Número entero ingresado: $numeroEntero")

    // Leer un Float
    println("Introduce un número flotante:")
    val numeroFlotante = scanner.nextFloat()
    println("Número flotante ingresado: $numeroFlotante")

    // Leer un Boolean
    println("Introduce true o false:")
    val valorBooleano = scanner.nextBoolean()
    println("Booleano ingresado: $valorBooleano")
}
