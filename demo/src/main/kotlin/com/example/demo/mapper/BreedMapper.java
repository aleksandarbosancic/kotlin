/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.domain.models.Breed;
import com.example.demo.domain.models.dto.BreedDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author abosancic
 */
@Mapper(config = CentralConfig.class)
public abstract class BreedMapper implements BaseMapper<Breed, BreedDTO>
{

    @Override
    public abstract BreedDTO toDTO(Breed breed);

    @Mappings(
    {
        @Mapping(target = "imagePath", ignore = true),
        @Mapping(target = "createdBy", ignore = true),
        @Mapping(target = "createdDate", ignore = true)
    })
    @InheritConfiguration
    public abstract Breed toEntity(BreedDTO dto);

}
