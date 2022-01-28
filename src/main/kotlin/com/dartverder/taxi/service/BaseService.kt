package com.dartverder.taxi.service


import java.util.*

interface BaseService<E: Any> {
    fun save(entity: E)
    fun saveAll(entities: List<E>)
    fun deleteById(id: Long)
    fun findAll(): List<E>?
    fun findById(id: Long): Optional<E>
}