package com.example.act1

fun main (){
    val number = 1..20

    val evenNumbers = number.filter {
        number -> number % 2 == 0
    }

    val doubled = evenNumbers.map {
        evenNumbers -> evenNumbers * 2
    }

    println("The even numbers are: $evenNumbers")
    println("The doubled numbers are: $doubled")
}
