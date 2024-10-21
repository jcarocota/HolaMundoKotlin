package main

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    // Sumar todos los números usando reduce
    val suma = numeros.reduce { acumulado, actual -> acumulado + actual }

    println(suma)  // Imprime: 15

    //MAximo
    val numeros2 = listOf(5, 3, 8, 1, 4)

    // Encontrar el máximo usando reduce
    val maximo = numeros2.reduce { max, actual ->
        if (actual > max) actual else max
    }

    println(maximo)  // Imprime: 8

    val palabras = listOf("hola", "mundo", "programación", "kotlin")

    // Sumar las longitudes de todas las palabras
    val longitudTotal = palabras.map { it.length }.reduce { suma, actual -> suma + actual }

    println(longitudTotal)  // Imprime: 26
}
