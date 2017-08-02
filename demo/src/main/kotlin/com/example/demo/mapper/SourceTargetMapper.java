/*
 * Copyright (c) 2017
 * AlphaGate Automatisierungstechnik, Rankweil, Austria  * 
 * @author      original: abo, last edit: $Author$
 * @version     $Id$
 */
package com.example.demo.mapper;

/**
 *
 * @author abosancic
 */
import com.example.demo.domain.models.Source;
import com.example.demo.domain.models.dto.Target;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DateMapper.class)// inject date time formated
public interface SourceTargetMapper
{

    SourceTargetMapper INSTANCE = Mappers.getMapper(SourceTargetMapper.class);

    @Mappings({
        @Mapping(source = "qax", target = "baz"),
        @Mapping(source = "baz", target = "qax"),
        @Mapping(source = "date", target = "dateFormated"),
        @Mapping(target = "createdBy", ignore = true),
        @Mapping(target = "createdDate", ignore = true)
    })
    Target sourceToTarget(Source source);

    @InheritInverseConfiguration
    Source targetToSource(Target target);
}
