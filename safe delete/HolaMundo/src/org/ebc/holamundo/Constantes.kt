package org.ebc.holamundo

class Constantes {
    companion object {
        const val PI = 3.14159
        const val URL_BASE = "https://en.wikipedia.org/wiki/Pi"
    }
}

fun main() {
    val paridadDolar: Double = 16.123456
    println("Paridad del dólar: $paridadDolar")

    //paridadDolar = 15.654321

    println("El número PI: ${Constantes.PI}")
    println("Explicación: ${Constantes.URL_BASE}")
}