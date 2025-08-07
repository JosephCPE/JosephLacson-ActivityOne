package com.example.act1

fun main() {

    val items = listOf<Any>("Hello", 123, true, 45.6, false, "World")


    for (item in items) {

        when (item) {
            is String -> println("$item is a String")
            is Int -> println("$item is an Integer")
            is Boolean -> println("$item is a Boolean")
            else -> println("$item is an unknown type")
        }
    }
}
