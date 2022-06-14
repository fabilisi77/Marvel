package com.example.marvel.utils

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

class Constants {
    companion object {
        const val BASE_URL = "https://gateway.marvel.com/v1/public/"
        val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
        const val PUBLIC_KEY = "12f5291a626c47da84b3465996df8d31"
        private const val PRIVATE_KEY = "4bf23743393caa3d077d972735f51122f70b93c9"

        fun hash(): String {
            val input = "$timeStamp$PRIVATE_KEY$PUBLIC_KEY"
            val md = MessageDigest.getInstance("MD5")
            return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
        }
    }

    object AppModuleKey {
        const val API_KEY = "apikey"
        const val TIMESTAMP = "ts"
        const val HASH_KEY = "hash"
    }
}