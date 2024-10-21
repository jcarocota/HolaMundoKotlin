fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)

    numeros.forEach { perrito ->
        val cuadrado = perrito*perrito
        println("El cuadrado de $perrito es $cuadrado")
    }

    // Iterar sobre los elementos de la lista con índice
    val cosasMixtas = arrayOf("manzana", 42, true, "Kotlin", 3.14)
    cosasMixtas.forEachIndexed { i, elemento ->
        println("Elemento en índice $i es $elemento")
    }
}