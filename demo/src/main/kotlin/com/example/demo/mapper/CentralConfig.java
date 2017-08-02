/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.domain.models.AbstractAuditingEntity;
import com.example.demo.domain.models.dto.BaseDTO;
import org.mapstruct.*;

/**
 *
 * @author abosancic
 */
@MapperConfig(
    mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG,
    unmappedTargetPolicy = ReportingPolicy.ERROR, uses = DateMapper.class, componentModel = "spring"
)
public interface CentralConfig
{

    // Not intended to be generated, but to carry inheritable mapping annotations:
    /**
     * Return entity from dto.
     *
     * @param dto
     * @return entity
     */
    @Mappings({
        @Mapping(target = "createdBy", source = "createdBy", ignore = true),
        @Mapping(target = "createdDate", source = "createdDate", ignore = true),
        @Mapping(target = "lastModifiedBy", source = "lastModifiedBy", ignore = true),
        @Mapping(target = "lastModifiedDate", source = "lastModifiedDate", ignore = true)
    })
    AbstractAuditingEntity anyDtoToEntity(BaseDTO dto);

    /**
     * Return a dto from entity.
     *
     * @param entity
     * @return dto
     */
    @Mappings({
        @Mapping(target = "createdBy", source = "createdBy"),
        @Mapping(target = "createdDate", source = "createdDate"),
        @Mapping(target = "lastModifiedBy", source = "lastModifiedBy"),
        @Mapping(target = "lastModifiedDate", source = "lastModifiedDate")
    })
    BaseDTO toDto(AbstractAuditingEntity entity);

}
