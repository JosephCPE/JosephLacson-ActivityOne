package com.example.act1

fun main(){
    println("Enter the first number: ")
    val firstNum = readln().toDouble()

    println("Enter the second number: ")
    val secondNum = readln().toDouble()

    println("type the operation you want: + - * / ")
    val operator = readln()

    when(operator){

        "+" -> println("The result is $firstNum + $secondNum = ${firstNum+secondNum}")
        "-" -> println("The result is $firstNum - $secondNum = ${firstNum-secondNum}")
        "*" -> println("The result is $firstNum *$secondNum= ${firstNum*secondNum}")
        "/" -> println("The result is $firstNum/$secondNum= ${firstNum/secondNum}")

        else -> println("you had typed an unknown operator")

    }

}
