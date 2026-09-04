package com.example.petshop

class sad(date: String): Mood(date) {
    override fun mood(): String {
        return "Im sad"
    }
}