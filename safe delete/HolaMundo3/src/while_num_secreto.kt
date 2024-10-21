import kotlin.random.Random

fun main() {
    val numeroSecreto: Int = Random.nextInt(1, 11)
    var intentos: Int = 0
    var adivinanza: Int = 0

    while(true) {
        intentos++
        println("Ingresa el número secreto")
        adivinanza = readln().toIntOrNull() ?: continue

        if (adivinanza == numeroSecreto) {
            println("Bien hecho muggle! eres libre ahora")
            break
        } else {
            println("Ja Ja Ja!! Estás atrapado")
        }

    }

    println("Número de intentos: $intentos")


}