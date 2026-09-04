package com.example.petshop

class Scorpion(name:String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "Hiss"
    }

    override fun pet() {
        println("The scorpion $name is being petted")
    }
}