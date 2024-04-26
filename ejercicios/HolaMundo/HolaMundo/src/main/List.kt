package main

fun main() {
    val colores = listOf("rojo", "verde", "azul")

    // Intentar modificar la lista resultará en un error
    // colores.add("amarillo")  // Esto arrojará un error porque la lista es inmutable

    // Recorrer la lista con un bucle for
    for (color in colores) {
        println(color)
    }

    // Acceder a un elemento específico
    println("El primer color de la lista es: ${colores[0]}")

}
