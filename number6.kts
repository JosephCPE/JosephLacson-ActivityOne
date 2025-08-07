package com.example.activity1

fun main(){
    var list= listOf(11,22,33,44,55)

    val reversedList = mutableListOf<Int>()
    for (i in (list.lastIndex downTo 0)){
        reversedList.add(list[i])
    }
    println("The reversed list : $reversedList")
    println("The original list : $list")
}
