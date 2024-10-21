import kotlin.random.Random

fun main() {
    //For básico/el parecido a Python

    val numeros = MutableList(10) {Random.nextInt(1, 50)}
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()

    for (num in numeros) {
        //println(num)
        if(num % 2 == 0) {
            pares.add(num)
        } else {
            impares.add(num)
        }
    }

    println("Lista total: ${numeros.joinToString(" ")}")
    println("Lista pares: ${pares.joinToString(" ")}")
    println("Lista impares: ${impares.joinToString(" ")}")

    //Rangos
    for(i in 1..5) {
        print(i)
    }
    println()

    //Rango letras
    for(letra in 'f' downTo 'a') {
        print(letra)
    }
    println()

    //Array mixto
    val cosasMixtas = arrayOf("manzana", 42, true, "Gatito", 3.14)
    for(elemento in cosasMixtas) {
        print("${elemento} ")
    }
    println()

    for(indice in cosasMixtas.indices) {
        println("Elemento en el índice $indice es ${cosasMixtas[indice]}")
    }
}