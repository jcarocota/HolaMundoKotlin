package main



fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Filtrar números mayores que 5
    val mayoresQueCinco = numeros.filter { it > 5 }

    println(mayoresQueCinco)  // Imprime: [6, 7, 8, 9, 10]

    data class Persona2(val nombre: String, val edad: Int)

    // Filtrar avanzado
    val personas = listOf(
        Persona2("Juan", 28),
        Persona2("Ana", 17),
        Persona2("Luis", 50),
        Persona2("Sofía", 33)
    )

    // Filtrar personas mayores de 30 años
    val mayoresDeTreinta = personas.filter { it.edad > 30 }
}
