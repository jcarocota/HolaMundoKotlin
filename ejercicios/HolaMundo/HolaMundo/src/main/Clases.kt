package main

/*
En Kotlin, las clases son uno de los pilares fundamentales de
la programación orientada a objetos. Las clases en Kotlin se
utilizan para modelar objetos del mundo real o abstractos con
atributos y métodos. A continuación, te muestro cómo se definen
y se utilizan las clases en Kotlin, con ejemplos prácticos.
 */

class Libro {
    var titulo: String = ""
    var autor: String = ""
    var añoPublicacion: Int = 0

    fun detallesDelLibro() {
        println("Libro: $titulo, Escrito por: $autor, Publicado en: $añoPublicacion")
    }

    //generate clone
    fun copy(titulo: String = this.titulo, autor: String = this.autor, añoPublicacion: Int = this.añoPublicacion) = Libro().apply {
        this.titulo = titulo
        this.autor = autor
        this.añoPublicacion = añoPublicacion
    }
}

class LibroInmutable(val titulo: String, val autor: String, val añoPublicacion: Int) {

    fun detallesDelLibro() {
        println("Libro: $titulo, Escrito por: $autor, Publicado en: $añoPublicacion")
    }
}

open class Publicacion(val titulo: String, val autor: String) {
    open fun info() {
        println("Publicación: $titulo por $autor")
    }
}

class LibroHerencia(titulo: String, autor: String, val añoPublicacion: Int) : Publicacion(titulo, autor) {
    override fun info() {
        super.info()
        println("Año de Publicación: $añoPublicacion")
    }
}

fun main() {
    val miLibro = Libro()
    miLibro.titulo = "1984"
    miLibro.autor = "George Orwell"
    miLibro.añoPublicacion = 1949

    miLibro.detallesDelLibro()

    //Libro inmutable
    val miLibroInmutable = LibroInmutable("1984", "George Orwell", 1949)
    miLibro.detallesDelLibro()

    //Libro herencia
    val miLibroHerencia = LibroHerencia("1984", "George Orwell", 1949)
}
