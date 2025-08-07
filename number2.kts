package com.example.act1

fun main() {
    val grade = listOf(85, 42,70,58,90)

    for (grade in grade) {
        if (grade >= 60) {
            println(" $grade is Passed")

        }
        else{
            println("$grade is Failed")
        }
    }
}
