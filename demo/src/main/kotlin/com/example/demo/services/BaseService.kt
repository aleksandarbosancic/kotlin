package com.example.demo.services

abstract class BaseService {

    constructor() {
        this.init()
    }

    fun init(): Unit {
        println("Init")
    }
}