package com.example.demo.services

import org.springframework.stereotype.Component

@Component
class MyService {

    var numb : Int = 5

    val numa : Int = 23

    var b: String? = "abc"
    //b = null // ok

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum(a: Int, b: Int, c: Int): Int = a + b + c

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    fun call(): Unit {
        this.printSum(1, 3)
    }

    fun call1() = this.printSum(1, 5)

    fun <T> asList(vararg ts: T): List<T> {
        val result = ArrayList<T>()
        for (t in ts) // ts is an Array
            result.add(t)
        return result
    }

    fun printList() {
        val list = this.asList(1, 2, 3)
        list.stream().forEach(System.out::println)
    }

    fun template(x: String): String {
        return x
    }

}
