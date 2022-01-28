package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Identifiable
import com.dartverder.taxi.service.BaseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


abstract class BaseController<E: Identifiable>(val baseService: BaseService<E>) {
    @GetMapping
    fun index() = baseService.findAll()

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun readById(@PathVariable id: Long) = baseService.findById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody newEntity: E) = baseService.save(newEntity)

    @PutMapping("{id}")
    fun update(@RequestBody entity: E, @PathVariable id: Long) {
        entity.id = id
        baseService.save(entity)
    }

    @DeleteMapping("{id}")
    fun deleteEntity(@PathVariable id: Long) = baseService.deleteById(id)
}