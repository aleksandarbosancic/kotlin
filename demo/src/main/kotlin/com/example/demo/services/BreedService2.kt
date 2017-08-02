package com.example.demo.services

import com.example.demo.domain.models.Breed
import com.example.demo.domain.models.dto.BreedDTO
import com.example.demo.mapper.BreedMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

/**
 * Breed service sould be java class not kotlin
 */
//@Component
class BreedService2 {

    @Autowired private
    lateinit var breedMapper : BreedMapper

    var col: java.util.Collection<Date>? = null

    fun getBreeds(): List<BreedDTO> {

        var a:BreedDTO = BreedDTO()
        a.id = 1
        a.name = "dog 1"

        var b:BreedDTO = BreedDTO()
        b.id = 2
        a.name = "dog 2"

        return listOf(a, b)
    }

//    fun post(breed: Breed): BreedDTO? {
//        println(breedMapper)
//        var v: BreedDTO = BreedDTO()
//        var dto: BreedDTO = breedMapper.toDTO(breed)
//        return dto
//    }

    //fun post1(breed: Breed): BreedDTO? = breedMapper.toDTO(breed) as BreedDTO

}
