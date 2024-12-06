package com.example.planetapp.models

import com.example.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)


val solarSystemPlanets = listOf(
    Planet(
        id = 1,
        name = "Mercúrio",
        type = "Planeta Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "57,91 milhões de km",
        diameter = "4.879 km",
        characteristics = "O menor planeta do Sistema Solar e o mais próximo do Sol. Não possui atmosfera significativa e tem uma superfície cheia de crateras.",
        imageRes = R.drawable.mercurio
    ),
    Planet(
        id = 2,
        name = "Vênus",
        type = "Planeta Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "108,2 milhões de km",
        diameter = "12.104 km",
        characteristics = "Possui uma atmosfera densa composta principalmente de dióxido de carbono, tornando-o extremamente quente devido ao efeito estufa.",
        imageRes = R.drawable.venus
    ),
    Planet(
        id = 3,
        name = "Terra",
        type = "Planeta Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "149,6 milhões de km",
        diameter = "12.742 km",
        characteristics = "O único planeta conhecido por abrigar vida, com atmosfera rica em oxigênio e uma superfície coberta de água.",
        imageRes = R.drawable.terra
    ),
    Planet(
        id = 4,
        name = "Marte",
        type = "Planeta Rochoso",
        galaxy = "Via Láctea",
        distanceFromSun = "227,9 milhões de km",
        diameter = "6.779 km",
        characteristics = "Conhecido como o Planeta Vermelho devido à presença de óxido de ferro em sua superfície. Possui as maiores montanhas e vales do Sistema Solar.",
        imageRes = R.drawable.marte
    ),
    Planet(
        id = 5,
        name = "Júpiter",
        type = "Planeta Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "778,5 milhões de km",
        diameter = "139.820 km",
        characteristics = "O maior planeta do Sistema Solar, famoso por sua Grande Mancha Vermelha, uma tempestade gigante que dura há séculos.",
        imageRes = R.drawable.jupiter
    ),
    Planet(
        id = 6,
        name = "Saturno",
        type = "Planeta Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "1,43 bilhões de km",
        diameter = "116.460 km",
        characteristics = "Conhecido por seus impressionantes anéis compostos de partículas de gelo e rocha.",
        imageRes = R.drawable.saturno
    ),
    Planet(
        id = 7,
        name = "Urano",
        type = "Planeta Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "2,87 bilhões de km",
        diameter = "50.724 km",
        characteristics = "Possui uma coloração azul-esverdeada devido à presença de metano em sua atmosfera. Ele gira quase de lado em relação ao seu plano orbital.",
        imageRes = R.drawable.urano
    ),
    Planet(
        id = 8,
        name = "Netuno",
        type = "Planeta Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "4,5 bilhões de km",
        diameter = "49.244 km",
        characteristics = "O planeta mais distante do Sol, conhecido por seus ventos extremamente rápidos e sua coloração azul intensa.",
        imageRes = R.drawable.netuno
    )
)
