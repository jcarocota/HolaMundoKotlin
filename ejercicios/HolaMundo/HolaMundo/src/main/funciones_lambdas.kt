package main

fun aplicarOperacion(x: Int, y: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(x, y)
}
fun main() {
    val suma = { x: Int, y: Int -> x + y }
    println(suma(5, 3))  // Imprime 8

    val resultado = aplicarOperacion(10, 20, { a, b -> a + b })
    println("El resultado es: $resultado")

    //Lambda con receptor
    val buildString = StringBuilder().apply {
        append("Hola ")
        append("mundo!")
    }.toString()

    println(buildString)  // Imprime Hola mundo!

    //Lambda con closure
    var contador = 0
    val incrementar = { contador++ }
    incrementar()
    incrementar()
    println("Contador: $contador") // Imprime Contador: 2
}
