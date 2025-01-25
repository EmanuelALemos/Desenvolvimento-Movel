package com.desenvolvimentomovel.es.msgapp.repository

import com.desenvolvimentomovel.es.msgapp.data.local.dao.MessageDao
import com.desenvolvimentomovel.es.msgapp.model.Message
import kotlinx.coroutines.flow.Flow

class MessageRepository(private val dao: MessageDao) {
    val allMessage: Flow<List<Message>> = dao.getAllMessages()

    suspend fun addMessage(content: String){
        val message =
            Message(content = content, timestamp = System.currentTimeMillis())
        dao.insertMessage(message)
    }
}