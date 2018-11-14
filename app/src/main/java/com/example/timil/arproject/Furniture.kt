package com.example.timil.arproject

class Furniture (var image: Int, var name: String, var desription: String, var sfbName: String) {

    override fun toString(): String {
        return "$name $desription"/*$image*/
    }

}