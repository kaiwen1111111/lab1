package com.example.petshop

class happy(date: String): Mood(date) {
    override fun mood(): String {
        return "Im happy"
    }
}