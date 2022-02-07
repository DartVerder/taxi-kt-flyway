package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.CarDto
import com.dartverder.taxi.mapper.CarMapper
import com.dartverder.taxi.model.Car
import com.dartverder.taxi.service.CarService
import org.mapstruct.factory.Mappers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cars")
class CarController(private val carService: CarService) :
    BaseController<Car, CarDto>(carService, Mappers.getMapper(CarMapper::class.java)) {


}