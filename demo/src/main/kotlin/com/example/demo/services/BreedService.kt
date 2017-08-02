package com.example.demo.services

import com.example.demo.domain.models.Breed
import com.example.demo.domain.models.dto.BreedDTO
import com.example.demo.mapper.BreedMapper
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Component

/**
 * Breed service sould be java class not kotlin
 */
@Component
class BreedService {

    var breedMapper : BreedMapper = Mappers.getMapper(BreedMapper::class.java)

    fun getBreeds(): List<BreedDTO> {

        var a:BreedDTO = BreedDTO()
        a.id = 1
        a.name = "dog 1"

        var b:BreedDTO = BreedDTO()
        b.id = 2
        a.name = "dog 2"

        return listOf(a, b)
    }

    fun post(breed: Breed): BreedDTO = breedMapper.toDTO(breed)

}
