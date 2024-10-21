package main.completos

import kotlin.random.Random

fun main() {
    val numeroAleatorio = Random.nextInt(1, 11) // Número aleatorio entre 1 y 10
    var numeroAdivinado: Int
    do {
        println("Adivina el número entre 1 y 10:")
        numeroAdivinado = readlnOrNull()?.toIntOrNull() ?: -1 // Lee la entrada del usuario y maneja valores no válidos
        if (numeroAdivinado != numeroAleatorio) {
            println("hahaha estás atrapado muggle...")
        }
    } while (numeroAdivinado != numeroAleatorio)

    println("¡Bien hecho mugle!")
}
