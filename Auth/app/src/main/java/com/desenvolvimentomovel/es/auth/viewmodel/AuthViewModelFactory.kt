package com.desenvolvimentomovel.es.auth.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.desenvolvimentomovel.es.auth.data.AuthRepository

class AuthViewModelFactory(private val repository: AuthRepository): ViewModelProvider.Factory {
    override fun <T: ViewModel> create (modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AuthViewModel::class.java)) {
            return AuthViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknow ViewModel class")
    }
}