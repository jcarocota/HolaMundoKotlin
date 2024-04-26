package main

fun main() {
    // Crear una lista mutable de superhéroes
    val superHeroes = mutableListOf("Spider-Man", "Wonder Woman", "Batman", "Black Panther", "Captain Marvel")

    // Modificar un elemento de la lista
    superHeroes[2] = "Iron Man"  // Cambia "Batman" por "Iron Man"
    println("Lista después de modificar un elemento: $superHeroes")

    // Obtener una sublista
    val subLista = superHeroes.subList(1, 4)  // Obtiene los elementos desde el índice 1 al 3 (el 4 no se incluye)
    println("Sublista de superhéroes: $subLista")

    // Agregar un elemento al inicio
    superHeroes.add(0, "Thor")
    println("Lista después de agregar al inicio: $superHeroes")

    // Agregar un elemento al final
    superHeroes.add("Hulk")
    println("Lista después de agregar al final: $superHeroes")

    // Eliminar el primer elemento
    superHeroes.removeAt(0)
    println("Lista después de eliminar el primer elemento: $superHeroes")

    // Eliminar el último elemento
    superHeroes.removeAt(superHeroes.size - 1)
    println("Lista después de eliminar el último elemento: $superHeroes")
}
