package com.sagero.kotlin.demo

import java.util.function.Consumer

fun main(args: Array<String>) {
    val list: List<String> = listOf("1", "2", "3")

    for (item in list) {
        println(item)
    }

    list.forEach(Consumer { println(it) })

    list.forEach(System.out::println)
}