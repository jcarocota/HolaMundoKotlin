package main

import java.util.*

class Persona(val nombre: String) {
    private var edad: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Edad no puede ser negativa. Se establecerá a 0.")
                field = 0
            }
        }

    private var ciudad: String = ""
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }  // Retorna la ciudad con la primera letra en mayúscula
        set(value) {
            field = value.trim()  // Elimina espacios en blanco al principio y al final
        }


    // Constructor secundario 1
    constructor(nombre: String, edad: Int) : this(nombre) {
        this.edad = edad
    }

    // Constructor secundario 2
    constructor(nombre: String, edad: Int, ciudad: String) : this(nombre, edad) {
        this.ciudad = ciudad
    }

    fun descripcion() {
        println("$nombre, $edad años, de $ciudad")
    }
}

fun main() {
    val persona1 = Persona("Juan")
    val persona2 = Persona("Ana", 25)
    val persona3 = Persona("Luis", 30, "Madrid")

    persona1.descripcion()  // Imprime: Juan, 0 años, de
    persona2.descripcion()  // Imprime: Ana, 25 años, de
    persona3.descripcion()  // Imprime: Luis, 30 años, de Madrid
}