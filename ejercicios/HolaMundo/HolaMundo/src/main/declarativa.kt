package main

/*
La programación declarativa se centra en qué
debería realizar el programa, más que en cómo
debería hacerlo. Este enfoque es más expresivo
y a menudo resulta en un código más conciso,
limpio y fácil de entender. SQL, HTML y lenguajes
de programación funcional como Haskell son ejemplos
de paradigmas que favorecen un enfoque declarativo.
Características Principales:

    Abstracción del Proceso: No se controla el flujo
        del programa de manera explícita. En lugar de
        ello, se define una serie de operaciones que
        describen lo que se desea lograr.
    Inmutabilidad: A menudo, los datos son inmutables.
        Una vez creados, los objetos no se modifican.
    Expresiones sobre instrucciones: El código tiende
        a ser más expresivo, describiendo la lógica de
        la aplicación sin entrar en los detalles de su
        implementación.
 */

fun encontrarPrimerNombreLargo2(nombres: List<String>, longitud: Int): String? {
    return nombres.firstOrNull { it.length > longitud }
}

fun main() {
    val nombres = listOf("Juan", "María", "José", "Ana", "Luisa")
    val primerNombreLargo = encontrarPrimerNombreLargo2(nombres, 4)
    println("El primer nombre largo es: $primerNombreLargo")
}