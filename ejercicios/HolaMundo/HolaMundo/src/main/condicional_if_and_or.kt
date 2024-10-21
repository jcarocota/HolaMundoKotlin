package main

fun main() {
    val calificacion = 85
    val asistencia = 75

    val resultado = if (calificacion >= 90 && asistencia >= 80) {
        "Excelente"
    } else if ((calificacion >= 80 && asistencia >= 80) || calificacion > 85) {
        "Muy Bien"
    } else if (calificacion >= 70 && asistencia >= 60) {
        "Bien"
    } else {
        "Necesita mejorar"
    }

    println("Tu resultado es: $resultado")
}
