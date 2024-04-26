package main

fun main() {
    // Leer un String
    println("Introduce un texto:")
    val texto = readln()
    println("Texto ingresado: $texto")

    // Leer un Int con manejo de errores
    val numeroEntero = readIntSafely()
    println("Número entero ingresado: $numeroEntero")

    // Leer un Float con manejo de errores
    val numeroFlotante = readFloatSafely()
    println("Número flotante ingresado: $numeroFlotante")

    // Leer un Boolean con manejo de errores
    val valorBooleano = readBooleanSafely()
    println("Booleano ingresado: $valorBooleano")
}

fun readIntSafely(): Int {
    while (true) {
        println("Introduce un número entero:")
        try {
            return readln().toInt()
        } catch (e: NumberFormatException) {
            println("Error: Entrada inválida. Por favor, introduce un número entero válido.")
        } finally {
            println("Este bloque se ejecuta siempre, haya o no haya excepción.")
        }
    }
}

fun readFloatSafely(): Float {
    while (true) {
        println("Introduce un número flotante:")
        try {
            return readln().toFloat()
        } catch (e: NumberFormatException) {
            println("Error: Entrada inválida. Por favor, introduce un número flotante válido.")
        }
    }
}

fun readBooleanSafely(): Boolean {
    while (true) {
        println("Introduce true o false:")
        try {
            return readln().toBoolean()
        } catch (e: IllegalArgumentException) {
            println("Error: Entrada inválida. Por favor, introduce 'true' o 'false'.")
        }
    }
}
