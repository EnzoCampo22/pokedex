package com.example.pokedex

fun main(){
    print("ingrese el numero que corresponda para saber el tipo: ")
    val pokeType = readLine()!!.toInt()
    print("ingrese el nombre del pokemon: ")
    val pokeCatch = readLine()!!.toString()

    pokedex(pokeCatch)

    tipoPokemon(pokeType)

}
// ingresando el numero registrado, podemos acceder rapidamente al tipo del pokemon en cuestion
fun tipoPokemon (type : Int){
    when (type){
        1,2,3,4 -> print("Tipo electrico")
        in 5..11 -> println("Tipo Fuego")
        in 12..19 -> println("Tipo agua")
        in 20..29 -> println("Tipo tierra")
        in 30..35 -> println("Tipo normal")
        in 36..40 -> println("Tipo fantasma")
        in 41..45 -> println("Tipo metal")
        else -> (println("Pokemon desconocido"))

    }
}
//conociendo el pokemon capturado e ingresando su nombre, te va a decir el tipo
fun pokedex(pok1 : String ) {
    when (pok1){
        "Pikachu" -> (println("Tipo electrico: Cuanto más potente es la energía eléctrica que genera " +
                "este Pokémon, más suaves y elásticas se vuelven las bolsas de sus mejillas."))

        "Zapdos" -> (println("Tipo electrico: Posee el poder de controlar la electricidad a su antojo. " +
                "Según la creencia popular, anida oculto en oscuros nubarrones de tormenta."))

        "Moltres" -> (println("Tipo Fuego: Se cuenta que alguna vez ha iluminado el camino con sus alas" +
                " flamígeras para rescatar a alguien que se había perdido en la montaña"))

        "Charizard" -> (println("Tipo Fuego: Sus potentes alas le permiten volar a una altura de 1400 m. " +
                "Escupe llamaradas que llegan a alcanzar temperaturas elevadísimas"))

        "Lapras" -> (println("Tipo Agua Este Pokémon posee una notable inteligencia y un corazón de oro." +
                " Entona un canto melodioso mientras surca el mar"))

        "Articuno" -> (println("Tipo Agua: Se dice que sus bellas alas azules se componen de hielo. " +
                "Vuela en torno a las montañas nevadas con su larga cola al viento"))

        "Rhyhorn" -> (println("Tipo Tierra, Roca: La cabeza no le da para retener más de una cosa. " +
                "Si se pone a correr, se le olvida al instante por qué empezó a hacerlo"))

        "Diglett" -> (println("Tipo Tierra : Este Pokémon avanza horadando la tierra a poca profundidad. " +
                "Resulta fácil localizarlo por los montículos que deja como rastro"))

        "Slaking" -> (println("Tipo Normal: Cuando Slaking se instala a vivir en una zona, " +
                "aparecen círculos de un metro de radio de terreno baldío, pues se come todo el césped que pilla mientras está tumbado boca abajo"))

        "Snorlax" -> (println("Tipo Normal: Este Pokémon tiene un estómago a prueba de bomba, por lo que es " +
                "capaz de ingerir incluso comida podrida o mohosa"))

        "Gengar" -> (println("Tipo Fantasma: Para quitar la vida a su presa, se desliza en su sombra y espera su " +
                "oportunidad en silencio"))

        "Mimikyu" -> (println("Tipo Fantasma:  Un investigador que miró dentro del saco para estudiar a " +
                "este Pokémon perdió la vida a causa de una misteriosa enfermedad"))

        "Metagross" -> (println("Tipo Metal: Formado a partir de la unión de dos Metang. Emplea su inteligencia, " +
                "comparable a la de un superordenador, para derrotar a sus rivales"))

        "Steelix" -> (println("Tipo Metal: Según dicen, si un Onix vive más de 100 años, su cuerpo" +
                " adquiere una composición que recuerda a la de los diamantes"))
        
        else -> println("Pokemon desconocido: porfavor atrape el especimen para poder estudiarlo mejor")
    }

}
