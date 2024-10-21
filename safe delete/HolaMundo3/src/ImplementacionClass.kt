fun main() {
    val miPrimerLibro: Libro = Libro()

    miPrimerLibro.autor = "George Orwell"
    miPrimerLibro.titulo = "1984"
    miPrimerLibro.anio = 1949

    //miPrimerLibro.detalleLibro()

    val miSegundoLibro = Libro()

    miSegundoLibro.titulo = "Aprendizaje Situado"
    miSegundoLibro.autor = "Jean Lave"
    miSegundoLibro.anio = 1991

    //miSegundoLibro.detalleLibro()

    val otroLibro = miSegundoLibro.copy()

    otroLibro.titulo = "Comunidad de Aprendizaje"

    miSegundoLibro.detalleLibro()
    otroLibro.detalleLibro()

}