package com.desenvolvimentomovel.es.msgapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Room
import com.desenvolvimentomovel.es.msgapp.data.local.database.AppDataBase
import com.desenvolvimentomovel.es.msgapp.repository.MessageRepository
import com.desenvolvimentomovel.es.msgapp.ui.theme.MsgAppTheme
import com.desenvolvimentomovel.es.msgapp.ui.view.MessageApp
import com.desenvolvimentomovel.es.msgapp.viewmodel.MessageViewModel
import com.desenvolvimentomovel.es.msgapp.viewmodel.MessageViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java,
            "messages-db"
        ).fallbackToDestructiveMigration().build()

        val repository = MessageRepository(db.messageDao())

        setContent {
            MsgAppTheme {
                val viewModel: MessageViewModel =
                    viewModel(factory = MessageViewModelFactory(repository))
                MessageApp(viewModel)
            }
        }
    }
}