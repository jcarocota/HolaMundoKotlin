package main

import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 11)  // Genera un número entre 1 y 10
    var intentos = 0
    var adivinanza: Int

    println("He pensado en un número entre 1 y 10. Intenta adivinarlo.")

    while (true) {
        println("Ingresa tu adivinanza:")
        adivinanza = readln().toIntOrNull() ?: continue  // Continúa con el bucle si la entrada no es un número

        intentos++

        if (adivinanza == numeroSecreto) {
            println("¡Correcto! El número secreto era $numeroSecreto. Lo adivinaste en $intentos intentos.")
            break
        } else if (adivinanza < numeroSecreto) {
            println("Demasiado bajo. Intenta de nuevo.")
        } else {
            println("Demasiado alto. Intenta de nuevo.")
        }
    }
}
