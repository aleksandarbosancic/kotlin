package com.example.demo.services;

import com.example.demo.domain.models.Breed;
import com.example.demo.domain.models.dto.BreedDTO;
import com.example.demo.mapper.BreedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class BreedService {

    @Autowired
    BreedMapper breedMapper;

    public List<BreedDTO> getBreeds() {

        BreedDTO a = new BreedDTO();
        a.setId(1l);
        a.setName("dog 1");

        BreedDTO b = new BreedDTO();
        b.setId(2l);
        a.setName("dog 2");

        return Stream.of(a, b).collect(Collectors.toList());
    }

    public BreedDTO post(Breed breed) {
        System.out.println(breedMapper);
        return breedMapper.toDTO(breed);
    }

}
