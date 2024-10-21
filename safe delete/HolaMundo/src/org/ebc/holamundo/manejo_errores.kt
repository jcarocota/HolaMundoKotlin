package org.ebc.holamundo

fun main() {
    // Leer un Int
    val numeroEntero = leerEnteroSeguro()
    println("Número entero ingresado: $numeroEntero")

}

fun leerEnteroSeguro(): Int? {
    var numero: Int? = null

    while (true) {
        print("Introduce un número entero: ")
        try {
            numero = readln().toInt()
            break
        } catch (error: Exception) {
            println("Error!!! Te equivocaste ")
        } finally {
            println("Yo me voy a ejecutar al final de este bloque")
        }
    }

    return numero
}