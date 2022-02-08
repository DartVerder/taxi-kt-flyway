package com.dartverder.taxi.controller

import com.dartverder.taxi.mapper.BaseMapper
import com.dartverder.taxi.mapper.MobileMapper
import com.dartverder.taxi.model.Identifiable
import com.dartverder.taxi.service.BaseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus

abstract class BaseWithMobileController<E : Identifiable, D, M>(
    override val baseService: BaseService<E>,
    override val baseMapper: BaseMapper<E, D>,
    private val mobileMapper: MobileMapper<E, M>
) : BaseController<E, D>(baseService, baseMapper) {

    @GetMapping("mobile")
    fun mobileAll() = mobileMapper.entityListToDtoList(baseService.findAll())

    @GetMapping("mobile/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun mobileById(@PathVariable id: Long) = mobileMapper.entityToDto(baseService.findById(id).get())

}