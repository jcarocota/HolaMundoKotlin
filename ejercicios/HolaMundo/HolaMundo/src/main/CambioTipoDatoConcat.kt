package main


/**
 *     Pedirles que prueben el código con diferentes valores de entrada y observen los resultados.
 *     Manejar posibles errores de formato al parsear, usando bloques try-catch para capturar excepciones como NumberFormatException.
 *     Explorar la diferencia entre concatenar con + y usar plantillas de string.
 */
fun main() {
    val inputString = "100"
    val inputDouble = "3.14"
    val inputInt = 100

    // Concatenación de String... cuiado!!!!
    println("Suma de un entero y un doble: ${inputDouble + inputInt}")

    // Parsear de String a Int
    val parsedInt = inputString.toInt()
    println("Valor entero: $parsedInt")

    // Parsear de String a Double
    val parsedDouble = inputDouble.toDouble()
    println("Valor doble: $parsedDouble")

    // Concatenación de texto y números
    val mensaje = "La suma de los números es: " + (parsedInt + parsedDouble)
    println(mensaje)

    //Arrays
    val array = arrayOf("Hola", "Mundo", "Kotlin")
    println(array)
    println(array.joinToString(" - "))
}
