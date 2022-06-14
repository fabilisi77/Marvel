package com.example.marvel.data.character

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterData(val results: List<CharacterResult>) : Parcelable