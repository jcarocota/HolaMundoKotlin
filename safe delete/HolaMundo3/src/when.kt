fun main() {
    val calificacion = 70

    val resultado = when (calificacion) {
        100 -> "Lo hiciste perfecto!!!"
        in 90..99 -> "Excelente!!"
        in 80..89 -> "Muy bien"
        in 70..79 -> "Bien"
        in 60..69 -> "Pasaste"
        else -> "Suerte para la próxima"
    }
    println("Resultado: $resultado")

    val dato: Any = true

    val resultado2 = when (dato) {
        is String -> "Es un texto"
        in 1..100 -> "Número dentro del rango 1-100"
        is Int -> "Es un número entero"
        else -> "Es de otro tipo"
    }
    println("Resultado 2: " + resultado2)

    val color = "lavanda"
    when (color) {
        "rojo", "verde", "azul" -> println("Color primario")
        "amarillo", "violeta", "naranja" -> println("Color secundario")
        else -> println("Color no identificado")
    }
}