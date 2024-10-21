package org.ebc.holamundo

fun main() {
    val inputString = "100"
    val inputDouble = "3.14"
    val inputInt = 100

    println("Suma de dos numeros: ${inputString + inputInt }")

    val valorEntero = inputString.toInt()

    println("Suma de dos numeros: ${valorEntero + inputInt }")

    println("Suma de dos numeros: ${inputDouble.toDouble() + inputInt }")

    val array = arrayOf("Hola", "Mundo", "Kotlin")
    println("Array: $array")
    println("Array; ${array.joinToString (" - \n") + " gatito" + 1}")

}