package com.example.farmapp.models

import com.example.farmapp.R

data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)



val farmAnimals = listOf(
    Animal(
        id = 1,
        name = "Bessie",
        species = "Vaca",
        imageRes = R.drawable.cow_image, // Substitua por seu recurso real
        description = "Uma vaca leiteira que fornece leite fresco todos os dias.",
        curiosities = "As vacas podem reconhecer até 50 membros de seu grupo.",
        isFavorite = false
    ),
    Animal(
        id = 2,
        name = "Clucky",
        species = "Galinha",
        imageRes = R.drawable.chicken_image, // Substitua por seu recurso real
        description = "Galinha poedeira que produz ovos nutritivos.",
        curiosities = "Galinhas podem sonhar enquanto dormem.",
        isFavorite = false
    ),
    Animal(
        id = 3,
        name = "Oinkie",
        species = "Porco",
        imageRes = R.drawable.pig_image, // Substitua por seu recurso real
        description = "Porco amigável e inteligente, adora se sujar na lama.",
        curiosities = "Porcos têm excelente memória e são muito sociais.",
        isFavorite = false
    ),
    Animal(
        id = 4,
        name = "Daisy",
        species = "Ovelha",
        imageRes = R.drawable.sheep_image, // Substitua por seu recurso real
        description = "Ovelha que fornece lã macia e quentinha.",
        curiosities = "As ovelhas têm uma visão periférica de quase 300 graus.",
        isFavorite = false
    ),
    Animal(
        id = 5,
        name = "Buddy",
        species = "Cavalo",
        imageRes = R.drawable.horse_image, // Substitua por seu recurso real
        description = "Cavalo rápido e elegante, ótimo para montaria.",
        curiosities = "Os cavalos conseguem dormir em pé e deitados.",
        isFavorite = false
    ),
    Animal(
        id = 6,
        name = "Gus",
        species = "Ganso",
        imageRes = R.drawable.goose_image, // Substitua por seu recurso real
        description = "Ganso guardião da fazenda, sempre alerta.",
        curiosities = "Os gansos formam laços de longo prazo e são monogâmicos.",
        isFavorite = false
    ),
    Animal(
        id = 7,
        name = "Billy",
        species = "Cabra",
        imageRes = R.drawable.goat_image, // Substitua por seu recurso real
        description = "Uma cabra brincalhona que adora escalar e explorar.",
        curiosities = "As cabras têm pupilas retangulares, o que melhora sua visão periférica.",
        isFavorite = false
    ),
    Animal(
        id = 8,
        name = "Quackers",
        species = "Pato",
        imageRes = R.drawable.duck_image, // Substitua por seu recurso real
        description = "Pato curioso que adora nadar em lagos e pântanos.",
        curiosities = "Os patos são impermeáveis devido a um óleo especial em suas penas.",
        isFavorite = false
    ),
    Animal(
        id = 9,
        name = "Charlie",
        species = "Burro",
        imageRes = R.drawable.donkey_image, // Substitua por seu recurso real
        description = "Burro trabalhador e leal, útil para transporte e carga.",
        curiosities = "Os burros têm excelente memória e podem reconhecer lugares após anos.",
        isFavorite = false
    ),
    Animal(
        id = 10,
        name = "Buzz",
        species = "Abelha",
        imageRes = R.drawable.bee_image, // Substitua por seu recurso real
        description = "Abelha trabalhadora que ajuda na polinização e produção de mel.",
        curiosities = "As abelhas podem visitar 50 a 100 flores em uma única viagem.",
        isFavorite = false
    )
)
