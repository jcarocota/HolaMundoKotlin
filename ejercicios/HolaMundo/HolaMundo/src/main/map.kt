package main

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    // Elevar al cuadrado cada número de la lista
    val cuadrados = numeros.map { it * it }

    println(cuadrados)  // Imprime: [1, 4, 9, 16, 25]
}
