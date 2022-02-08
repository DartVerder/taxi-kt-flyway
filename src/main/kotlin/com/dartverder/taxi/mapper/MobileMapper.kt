package com.dartverder.taxi.mapper

abstract class MobileMapper<E, D> {
    abstract fun entityToDto(entity: E): D

    abstract fun entityListToDtoList(entities: List<E?>?): List<D?>
}