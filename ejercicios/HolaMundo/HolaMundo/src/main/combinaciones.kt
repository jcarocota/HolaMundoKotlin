package main

import java.text.NumberFormat
import java.util.Locale

data class Empleado(val nombre: String, val departamento: String, val salario: Double)

val empleados = listOf(
    Empleado("Juan", "IT", 3000.0),
    Empleado("Ana", "Marketing", 3200.0),
    Empleado("Luis", "IT", 2800.0),
    Empleado("Sofía", "Ventas", 2500.0),
    Empleado("Carlos", "Marketing", 2700.0),
    Empleado("Marta", "IT", 4000.0)
)

fun formatearComoMonedaUS(valor: Double): String {
    val formato = NumberFormat.getCurrencyInstance(Locale.US)
    return formato.format(valor)
}

fun main() {
    val aumento = 1.10  // Aumento del 10%

    val totalSalarioIT = empleados
        .filter { it.departamento == "IT" }  // Filtrar por departamento de IT
        .map { it.salario * aumento }        // Aplicar aumento
        .reduce { acum, salario -> acum + salario }  // Sumar todos los salarios aumentados

    println("El salario total en IT después del aumento es: ${formatearComoMonedaUS(totalSalarioIT)}")

    val totalSalarioMarketing = empleados
        .filter { it.departamento == "Marketing" }
        .sumOf { it.salario * aumento }  // Calcular la suma total directamente

    println("El salario total en Marketing después del aumento es: ${formatearComoMonedaUS(totalSalarioMarketing)}")
}
