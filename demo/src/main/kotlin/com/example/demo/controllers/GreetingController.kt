package com.example.demo.controllers

import com.example.demo.domain.Customer
import com.example.demo.domain.Greeting
import com.example.demo.services.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/customer")
    fun customer(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Customer("Hello, $name")

    @GetMapping("/service")
    fun service(@RequestParam(value = "name", defaultValue = "World") name: String): Customer {
        var my: MyService = MyService()

        my.printSum(2,4)
        my.printList()
        my.call()
        my.call1()

        println(my.numb)
        println(my.numa)
        println(my.b)

        my.numb = 34
        //my.numa = 34

        var list = listOf("apple", "banana", "kiwi")

        for (fruit in list)
            println("The fruit : $fruit")

        return Customer("Hello, $name")
    }

}
