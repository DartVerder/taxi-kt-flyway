package com.dartverder.taxi.service


import com.dartverder.taxi.model.Identifiable
import java.util.*

interface BaseService<E : Identifiable> {
    fun save(entity: E)
    fun update(entity: E, id: Long)
    fun saveAll(entities: List<E>)
    fun deleteById(id: Long)
    fun findAll(): List<E>?
    fun findById(id: Long): Optional<E>
}