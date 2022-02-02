package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Identifiable
import com.dartverder.taxi.service.BaseService
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

open class BaseServiceImpl<E : Identifiable>(protected open val repository: JpaRepository<E, Long>) : BaseService<E> {

    override fun save(entity: E) {
        repository.save(entity)
    }

    override fun update(entity: E, id: Long) {
        entity.id = id
        save(entity)
    }

    override fun findAll(): List<E>? {
        return repository.findAll()
    }

    override fun deleteById(id: Long) {
        repository.deleteById(id)
    }

    override fun findById(id: Long): Optional<E> {
        return repository.findById(id)
    }

    override fun saveAll(entities: List<E>) {
        repository.saveAll(entities)
    }
}