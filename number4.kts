package com.example.act1

fun main(){
    var number = listOf(20,19,30,1,5,6)
    var maxNumber = number[0]


    for (number in number){
        if (maxNumber < number )
            maxNumber = number
    }

    println("The largest number is: $maxNumber")

}
