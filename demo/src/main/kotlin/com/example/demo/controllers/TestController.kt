package com.example.demo.controllers

import com.example.demo.services.AService
import com.example.demo.services.MyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @Autowired
    lateinit var a: AService

    @Autowired
    lateinit var myService: MyService

    @RequestMapping("/test/{x}")
    fun test(x: String): String {

        return x
    }

    @GetMapping("/test1/{a}")
    fun test1(@PathVariable("a") a:String): String {
        return myService.template(a)
    }

}