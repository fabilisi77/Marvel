package com.example.marvel.data.character

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterResult(
    var id: String = "",
    var name: String = "",
    var description: String = "",
    var thumbnail: Thumbnail = Thumbnail("", ""),
    var urls: List<Url> = ArrayList(),
) : Parcelable {

    @Parcelize
    data class Thumbnail(val path: String, val extension: String) : Parcelable

    @Parcelize
    data class Url(val type: String, val url: String) : Parcelable

}


