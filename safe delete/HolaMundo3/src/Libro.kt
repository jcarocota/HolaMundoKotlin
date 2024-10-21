class Libro {
    var titulo: String? = null
    var autor: String? = null
    var anio: Int = 0

    fun detalleLibro() {
        println("Libro: $titulo, del autor: $autor, publicado en: $anio")
    }

    fun copy(titulo:String? = this.titulo, autor: String? = this.autor, anio: Int = this.anio) = Libro().apply {
        this.titulo = titulo
        this.autor = autor
        this.anio = anio
    }
}