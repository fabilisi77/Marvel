package com.example.marvel.ui.allcharacter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvel.api.repository.MarvelRepository

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest


class CharacterViewModel (private val marvelRepository: MarvelRepository) :
    ViewModel() {

    val searchQuery = MutableStateFlow("")

    val searchResult = searchQuery.flatMapLatest {query ->


}



