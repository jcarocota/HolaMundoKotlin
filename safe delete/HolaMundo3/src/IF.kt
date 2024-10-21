fun main() {
    val calificacion = 81
    val asistencia = 50

    //and --> &&
    //or --> ||
    /*if (calificacion >= 90 && asistencia >= 80 ) {
        println("Excelente calificacion")
    } else if((calificacion >= 80 && asistencia >= 80) || calificacion >= 85) {
        print("Muy bien")
    } else if (calificacion >= 60 && asistencia >= 60) {
        print("Simplemente pasaste")
    } else {
        println("Vas a repetir el curso")
    }*/

    val resultado = if (calificacion >= 90 && asistencia >= 80 ) {
        "Excelente calificacion"
    } else if((calificacion >= 80 && asistencia >= 80) || calificacion >= 85) {
        "Muy bien"
    } else if (calificacion >= 60 && asistencia >= 60) {
        "Simplemente pasaste"
    } else {
        "Vas a repetir el curso"
    }

    println("Resultado: $resultado")

    val numerosSecuencia = 1..100

    val numeroBuscar = 20
    if (numeroBuscar in numerosSecuencia) {
        println("Sí está el número $numeroBuscar!!!")
    } else {
        println("No está el número $numeroBuscar")
    }

    //not in
    if (numeroBuscar !in numerosSecuencia) {
        println("Efectivamente, el número $numeroBuscar no está en la sec!!!")
    } else {
        println("El número $numeroBuscar sí está")
    }


}