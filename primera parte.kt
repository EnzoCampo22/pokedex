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
//conociendo el pokemon el pokemon capturado e ingresando su nombre, te va a decir el tipo
fun pokedex(pok1 : String ) {
    when (pok1){
        "Pikachu", "Zapdos" -> (print("Tipo electrico"))
        "Moltres" , "Charizard" -> (println("Tipo Fuego"))
        "Lapras" , "Gyarados" -> (println("Tipo Agua"))
        "Ryhorn", "Diglets" -> (println("Tipo Tierra"))
        "Slaking", "Snorlax" -> (println("Tipo Normal"))
        "Gengar", "Mimikyu" -> (println("Tipo Fantasma"))
        "Metagross", "Steelix" -> (println("Tipo Metal"))
        else -> println("Pokemon desconocido")
    }

}
