package com.example.demo.controllers

import com.example.demo.domain.models.dto.BreedDTO
import com.example.demo.services.BreedService
import com.example.demo.services.BreedService2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class BreedController {

    @Autowired
    lateinit var breedService: BreedService

    @GetMapping("/breeds")
    fun get(): List<BreedDTO> = breedService.getBreeds()

//    @PostMapping("/breeds")
//    fun post(@RequestBody breed:Breed): BreedDTO? = breedService.post(breed)

//    @PostMapping("/breeds1")
//    fun post1(@RequestBody breed:Breed): BreedDTO? = breedService.post1(breed)

}