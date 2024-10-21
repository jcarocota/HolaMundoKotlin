package main

fun main() {
    val calificacion:Int = 85
    val resultado = when (calificacion) {
        in 90..100 -> "Excelente"
        in 80..89 -> "Muy Bien"
        in 70..79 -> "Bien"
        in 60..69 -> "Suficiente"
        else -> "Necesita mejorar"
    }

    println("Tu calificación es: $resultado")


    val dato: Any = 12345

    val resultado2 = when (dato) {
        is String -> "Es un texto"
        in 1..100 -> "Número dentro del rango 1-100"
        is Int -> "Es un número entero"
        else -> "Es de otro tipo"
    }

    println(resultado2)

    val color = "rojo"

    when (color) {
        "rojo", "verde", "azul" -> println("Color primario")
        "amarillo", "violeta", "naranja" -> println("Color secundario")
        else -> println("Color no identificado")
    }


}
