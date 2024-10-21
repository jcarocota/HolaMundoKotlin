package hola

// Aquí nombramos a nuestra clase... la receta para crear el objeto
class Adivinador {
    //Propiedades del Objeto
    //val -> Constante... solo puede asignarse valor 1 vez
    private val numeroAleatorio:Int = (1..10).random();
    //var -> Variable... puede cambiar su valor
    private var intentos:Int = 0;

    /**
     * Esta función/comportamiento del objeto se encargará de solicitar
     * un número al usuario. Regresa el número ingresado.
     */
    private fun pedirNumero(): Int? {
        //Imprime el mensaje en pantalla "Adivina el número (entro 1 y 10): "
        print("Adivina el número (entro 1 y 10): ")

        /**
         * Declaramos una variable donde vamos a guardar el número
         * proporcionado por el usuario. Le indicamos un ? para
         * avisar que puede haber un número entero o un null.
         *
         * readlnOrNull -> Lee la info escrita por el user o si no hay info
         * regresa null.
         *
         * toIntOrNull -> Convierte el dato leido a entero y si no es posible
         * regresa un null
         */
        val numero:Int? = readlnOrNull()?.toIntOrNull();

        //Regresamos el valor escrito
        return numero;
    }

    /**
     * Iniciar el Adivinador
     */
    fun iniciar() {
        println("¡Hola Muggle! Bienvenido al Adivinador 2.0");

        var numeroAdivinado:Int?;

        do {
            numeroAdivinado = pedirNumero();
            this.intentos++;

            if(numeroAdivinado != this.numeroAleatorio) {
                println("¡ja ja ja! Estás atrapado muggle");
            } else {
                println("Bien hecho muggle... eres libre ahora");
            }
        } while(numeroAdivinado != this.numeroAleatorio);

        println("El juego se acabó");
    }
}