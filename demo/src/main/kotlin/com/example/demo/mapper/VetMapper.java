/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.domain.models.Vet;
import com.example.demo.domain.models.dto.VetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

/**
 *
 * @author abosancic
 */
@Mapper
//@Mapper(config = CentralConfig.class)
public abstract class VetMapper implements BaseMapper<Vet, VetDTO> {
    
    public abstract Vet toEntity(VetDTO dto);
	
    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "createdBy", ignore = true),
        @Mapping(target = "createdDate", ignore = true),
        @Mapping(target = "lastModifiedBy", ignore = true),
        @Mapping(target = "lastModifiedDate", ignore = true)
    })
    public abstract void updateVetFromVet(Vet in, @MappingTarget Vet vet);
    
}
