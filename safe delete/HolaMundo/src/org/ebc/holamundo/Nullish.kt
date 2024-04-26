package org.ebc.holamundo

fun main() {
    var nombre:String? = null

    println("Nombre: ${nombre}  y tiene ${nombre?.length} caracteres")

    nombre?.let{valor:String ->
        println("El nombre de la persona es $valor y la longitud de ese valor es ${valor.length}")
    } ?: println("El valor de nombre es nulo")

}
