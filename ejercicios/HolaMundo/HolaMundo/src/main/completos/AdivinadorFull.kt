package main.completos

// Definición de la clase Juego
class Juego {
    private val numeroAleatorio: Int = (1..10).random() // Genera un número aleatorio entre 1 y 10
    private var intentos: Int = 0

    // Método para iniciar el juego
    fun iniciar() {
        println("¡Bienvenido al juego de adivinanza!")
        var numeroAdivinado: Int?
        do {
            numeroAdivinado = pedirNumero() // Solicita al usuario un número
            intentos++
            if (numeroAdivinado != numeroAleatorio) {
                println("hahaha estás atrapado muggle...")
            }
        } while (numeroAdivinado != numeroAleatorio)

        println("¡Bien hecho muggle! Adivinaste el número en $intentos intentos.")
    }

    // Método para solicitar un número al usuario
    private fun pedirNumero(): Int? {
        println("Adivina el número (entre 1 y 10):")
        return readlnOrNull()?.toIntOrNull() // Convierte la entrada a número o devuelve null si no es un número
    }
}

// Clase principal que ejecuta el juego
fun main() {
    val juego = Juego() // Crear una instancia del juego
    juego.iniciar()     // Iniciar el juego
}
