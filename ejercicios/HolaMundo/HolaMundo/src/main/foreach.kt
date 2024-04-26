package main

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)

    // Iterar sobre los elementos de la lista
    numeros.forEach { numero ->
        val cuadrado = numero * numero
        println("El cuadrado de $numero es $cuadrado")
    }

    // Iterar sobre los elementos de la lista con índice
    val cosasMixtas = arrayOf("manzana", 42, true, "Kotlin", 3.14)
    cosasMixtas.forEachIndexed { indice, elemento ->
        println("Elemento en índice $indice es $elemento")
    }

    // Modificar elementos de la lista
    val numerosMutables = mutableListOf(10, 20, 30, 40, 50)
    numerosMutables.forEachIndexed { indice, numero ->
        if (indice % 2 == 0) {
            numeros[indice] = numero * 2
        }
    }
    println("Números después de modificar cada tercer elemento: ${numeros.joinToString(separator = ",")}")
}
