package main

/*
La programación imperativa se basa en una serie
de instrucciones para decirle a la computadora
cómo hacer las cosas, paso a paso, manipulando
el estado del programa. Este paradigma se centra
en describir cómo se deben realizar las operaciones.
La mayoría de los lenguajes de programación
tradicionales como C, C++, y Java soportan la
programación imperativa.

Características Principales:

    Control de Flujo: Utiliza bucles, condicionales
        y sentencias de control para dirigir el
        flujo del programa.
    Estado Mutable: Modifica variables y estados a lo
        largo del tiempo.
    Instrucciones: Cada línea de código suele representar
        un paso específico que cambia el estado del
        programa (como asignar valores o modificar
        estructuras de datos).
 */

fun encontrarPrimerNombreLargo(nombres: List<String>, longitud: Int): String? {
    for (nombre in nombres) {
        if (nombre.length > longitud) {
            return nombre
        }
    }
    return null
}

fun main() {
    val nombres = listOf("Juan", "María", "José", "Ana", "Luisa")
    val primerNombreLargo = encontrarPrimerNombreLargo(nombres, 4)
    println("El primer nombre largo es: $primerNombreLargo")
}