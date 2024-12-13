package com.rocketseat.nlw.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.rocketseat.nlw.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)


val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        title = "Workshop de Inteligência Artificial",
        description = "Explorando o impacto da IA no futuro.",
        date = "2024-12-20",
        location = "Auditório Central",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),

    Event(
        id = 3,
        title = "Hackathon de Startups",
        description = "Crie soluções inovadoras em 48 horas.",
        date = "2024-12-22",
        location = "Espaço Inovação",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),

    Event(
        id = 4,
        title = "Palestra sobre Sustentabilidade",
        description = "Tecnologia em prol do meio ambiente.",
        date = "2024-12-18",
        location = "Universidade Verde",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),

    Event(
        id = 5,
        title = "Feira de Tecnologia e Educação",
        description = "Inovação no ensino e aprendizado.",
        date = "2024-12-25",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),

    Event(
        id = 6,
        title = "Congresso de Desenvolvimento de Software",
        description = "Metodologias e práticas modernas.",
        date = "2024-12-28",
        location = "Hotel Global Tech",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),

    )

