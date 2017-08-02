/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.domain.models.AbstractAuditingEntity;
import com.example.demo.domain.models.dto.BaseDTO;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author abosancic
 * @param <E> Entity
 * @param <DTO> DTO object
 */
public interface BaseMapper<E extends AbstractAuditingEntity, DTO extends BaseDTO> {
    
    /**
     * Return a dto from entity
     * 
     * @param entity
     * @return dto
     */
    public abstract DTO toDTO(E entity);
    
    /**
     * Return list of DTO's.
	 * 
     * @param entities
     * @return
     */
    public abstract List<DTO> toListDTO(List<E> entities);
    
    /**
     * Return list of DTO's.
	 * 
     * @param dtos
     * @return
     */
    public abstract List<E> toListEntity(List<DTO> dtos);
	
	/**
     * Return list of DTO's
	 * 
     * @param entities
     * @return
     */
    public abstract List<DTO> toListDTO(Set<E> entities);
	
	/**
     * Return set of DTO's
	 * 
     * @param entities
     * @return
     */
    public abstract Set<DTO> toSetDTO(List<E> entities);
    
	/**
     * Return set of DTO's
	 * 
     * @param entities
     * @return
     */
    public abstract Set<DTO> toSetDTO(Set<E> entities);
    
	/**
     * Return set of entitie's
	 * 
     * @param dtos
     * @return
     */
    public abstract Set<E> toSetEntity(Set<DTO> dtos);
    
    /**
     *
     * @param entities
     * @return
     */
    default Stream<DTO> toStreamDTO(List<E> entities){
        return this.toListDTO(entities).stream();
    }
    
    /**
     *
     * @param entities
     * @return
     */
    default Stream<DTO> toStreamDTO(Set<E> entities){
        return this.toListDTO(entities).stream();
    }
    
    /**
     *
     * @param entities
     * @return
     */
    default Stream<E> toStreamEntity(Set<DTO> dtos){
        return this.toSetEntity(dtos).stream();
    }
    
    /**
     *
     * @param dtos
     * @return
     */
    default Stream<E> toStreamEntity(List<DTO> dtos){
        return this.toListEntity(dtos).stream();
    }
    
}
