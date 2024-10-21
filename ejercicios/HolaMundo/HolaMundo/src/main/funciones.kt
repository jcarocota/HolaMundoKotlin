package main

fun calcularArea(longitud: Int, ancho: Int): Int {
    return longitud * ancho
}
fun calcularArea2(longitud: Int, ancho: Int): Int = longitud * ancho

fun calcularArea3(longitud: Int = 5, ancho: Int = 2): Int = longitud * ancho

fun main() {
    val longitud = 5
    val ancho = 3
    val area = calcularArea(longitud, ancho)
    println("El área del rectángulo es: $area")

    val area2 = calcularArea2(5, 10)
    println("El área del rectángulo es: $area2")

    val area3 = calcularArea3(10, 5)
    val area4 = calcularArea3()  // Usa valores por defecto: 5 y 2
    println("El área con valores específicos es: $area3")
    println("El área con valores por defecto es: $area4")
}
