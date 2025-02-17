package com.desenvolvimentomovel.es.msgapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.desenvolvimentomovel.es.msgapp.data.local.dao.MessageDao
import com.desenvolvimentomovel.es.msgapp.model.Message


@Database(entities = [Message::class], version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {
    abstract fun messageDao(): MessageDao
}