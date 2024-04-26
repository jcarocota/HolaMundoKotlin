package main

/**
 * Actividades para los estudiantes:
 *
 *     Pedirles que agreguen más constantes a la clase Constants, como una para almacenar el nombre de la empresa o configuraciones comunes.
 *     Modificar el programa para usar estas nuevas constantes.
 */


class Constants {
    companion object {
        const val PI = 3.14159
        const val URL_BASE = "https://en.wikipedia.org/wiki/Pi"
    }
}

fun main() {
    println("Valor de PI: ${Constants.PI}")
    println("URL base para API: ${Constants.URL_BASE}")
}
