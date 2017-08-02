package com.example.demo.controllers

import com.example.demo.services.AService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @Autowired
    lateinit var a: AService

    @RequestMapping("/test")
    fun test(x: String): String {

        return x
    }

}