package com.dartverder.taxi.controller

import com.dartverder.taxi.mapper.BaseMapper
import com.dartverder.taxi.model.Identifiable
import com.dartverder.taxi.service.BaseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

abstract class BaseController<E : Identifiable, D>(
    open val baseService: BaseService<E>,
    open val baseMapper: BaseMapper<E, D>
) {
    @GetMapping
    open fun index() = baseMapper.entityListToDtoList(baseService.findAll())

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun readById(@PathVariable id: Long) = baseMapper.entityToDto(baseService.findById(id).get())

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody newEntity: E) = baseService.save(newEntity)

    @PutMapping("{id}")
    fun update(@RequestBody entity: E, @PathVariable id: Long) {
        baseService.update(entity, id)
    }

    @DeleteMapping("{id}")
    fun deleteEntity(@PathVariable id: Long) = baseService.deleteById(id)
}