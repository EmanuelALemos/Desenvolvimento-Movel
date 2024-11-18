package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)
        nameText.text = "Emanuel Lemos"
        descriptionText.text = "Estudante do 6° período de Engenharia de Software"
        currentJobText.text = "Emprego Atual: Desenvolvedor Mobile"

        val experiencias = listOf(
            "Desenvolvedor Mobile - PIES III",
            "Desenvolvedor Mobile - Colonymon",
            "Bolsista Bia - UFC",
            "Desenvolvedor Web - PIES II",
            "Desenvolvedor DeskTop - PIES I"
        )

        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }

        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de perfil de ${nameText.text.toString()}", Toast.LENGTH_SHORT).show()
        }

    }


}