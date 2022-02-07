package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.CarDto
import com.dartverder.taxi.dto.CarModelDto
import com.dartverder.taxi.mapper.CarMapper
import com.dartverder.taxi.mapper.CarModelMapper
import com.dartverder.taxi.model.Car
import com.dartverder.taxi.model.CarModel
import com.dartverder.taxi.service.CarModelService
import com.dartverder.taxi.service.CarService
import org.mapstruct.factory.Mappers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("carmodels")
class CarModelController(private val carModelService: CarModelService) :
    BaseController<CarModel, CarModelDto>(carModelService, Mappers.getMapper(CarModelMapper::class.java)) {


}