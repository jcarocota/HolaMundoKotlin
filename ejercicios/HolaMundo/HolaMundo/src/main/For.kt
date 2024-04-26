package main

import kotlin.random.Random

fun main() {
    val numeros = MutableList(10) { Random.nextInt(1, 101) }  // Lista de 10 números aleatorios entre 1 y 100
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()

    for (numero in numeros) {
        if (numero % 2 == 0) {
            pares.add(numero)
        } else {
            impares.add(numero)
        }
    }

    println("Números generados: $numeros")
    println("Números pares: $pares")
    println("Números impares: $impares")

    //Rango de números
    for (i in 1..<5) {  // Equivale a 1, 2, 3, 4 (5 está excluido) until
        println(i)
    }

    //Rango de letras
    for (ch in 'f'  downTo   'a') {
        println(ch)
    }

    //Rango de números con paso
    val cosasMixtas = arrayOf("manzana", 42, true, "Kotlin", 3.14)
    for (indice in cosasMixtas.indices) {
        println("Elemento en el índice $indice es ${cosasMixtas[indice]}")
    }
}
