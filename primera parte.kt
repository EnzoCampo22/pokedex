package com.example.pokedex
//Crear un programa utilzando el condicional WHEN.
//Vamos a crear un programa que define el tipo de nuestro pokemon dependiendo cual atrapemos.
//ejemplo : Atrapamos un Pikachu y devolvemos por consola su tipo = "Electrico"
//Vamos a manejar 6 tipos y el resto seran "unknown"
//- Electrico
//- Fuego
//- Agua
//- Tierra
//- Normal
//- Fantasma
//Luego vamos a crear un repositorio nuevo en el cual vamos a crear 2 branches: develop y pokemon
//Dentro de la branch pokemon vamos a agregar un nuevo tipo de pokemon a nuestro codigo el cual sera : "Metal"
//Vamos a hacer COMMIT de nuestro codigo y PUSH al branch pokemon
//despues hacemos un Pullrequest hacia el branch develop con los cambios (hacer un Merge si esta todo bien)

fun main(){

    val pokeCatch = readLine()!!.toString()
    pokedex(pokeCatch)


}
fun pokedex(pok1 : String ) {
    when (pok1){
        "Pikachu", "Zapdos" -> (print("Tipo electrico"))
        "Moltres" , "Charizard" -> (println("Tipo Fuego"))
        "Lapras" , "Gyarados" -> (println("Tipo Agua"))
        "Ryhorn", "Diglets" -> (println("Tipo Tierra"))
        "Slaking", "Snorlax" -> (println("Tipo Normal"))
        "Gengar", "Mimikyu" -> (println("Tipo Fantasma"))
        else -> println("Pokemon desconocido")
    } 

}