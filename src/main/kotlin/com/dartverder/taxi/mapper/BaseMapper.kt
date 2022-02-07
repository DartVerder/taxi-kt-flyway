package com.dartverder.taxi.mapper

import org.mapstruct.BeanMapping
import org.mapstruct.MappingTarget
import org.mapstruct.NullValuePropertyMappingStrategy

abstract class BaseMapper <E,D> {
    abstract fun dtoToEntity(dto: D): E

    abstract fun entityToDto(entity: E): D

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun updateEntityFromDto(dto: D, @MappingTarget entity: E)

    abstract fun entityListToDtoList(entities: List<E?>?): List<D?>
}