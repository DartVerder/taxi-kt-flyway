package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.CarModelDto
import com.dartverder.taxi.mapper.CarModelMapper
import com.dartverder.taxi.model.CarModel
import com.dartverder.taxi.service.CarModelService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("carmodels")
class CarModelController(carModelService: CarModelService) :
    BaseController<CarModel, CarModelDto>(
        baseService = carModelService,
        baseMapper = Mappers.getMapper(CarModelMapper::class.java)
    )