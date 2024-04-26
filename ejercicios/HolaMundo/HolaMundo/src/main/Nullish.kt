package main

/**
 *     Cambiar el valor inicial de nombre y observar cómo cambia la salida del programa.
 *     Agregar más variables opcionales y manipularlas de forma segura.
 *     Utilizar el operador de afirmación no nula (!!) de forma cautelosa para ver cómo puede lanzar un NullPointerException.
 */
fun main() {
    var nombre: String? = "Juan"
    println("El nombre es: ${nombre} y tiene ${nombre?.length} caracteres.")

    // Cambiar a null para ver cómo se maneja
    nombre = null
    println("El nombre es: ${nombre} y tiene ${nombre?.length} caracteres.")

    // Usando let para ejecutar código solo si la variable no es nula
    nombre?.let {it: String ->
        println("El nombre ($it) tiene ${it.length} caracteres.")
    } ?: println("El nombre es nulo")
}
