fun main() {
    val superHeroes = mutableListOf("Spider-Man", "Wonder Woman", "Batman", "Black Panther", "Captain Marvel")
    println("superHeroes: ${superHeroes.joinToString(" ")}")

    superHeroes[2] = "Iron Man"
    println("superHeroes: ${superHeroes.joinToString(" ")}")

    val subLista = superHeroes.subList(1, 4)
    println("Sublista de superhéroes: ${subLista.joinToString(" ")}")

    // Agregar un elemento al inicio
    superHeroes.add(0, "Thor")
    println("superHeroes: ${superHeroes.joinToString(" ")}")

    // Agregar un elemento al final
    superHeroes.add("Hulk")
    println("Lista después de agregar al final: $superHeroes")

    // Eliminar el primer elemento
    superHeroes.removeAt(0)
    println("Lista después de eliminar el primer elemento: $superHeroes")
}