package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.CarDto
import com.dartverder.taxi.dto.CarMobileDto
import com.dartverder.taxi.mapper.CarMapper
import com.dartverder.taxi.mapper.CarMobileMapper
import com.dartverder.taxi.model.Car
import com.dartverder.taxi.service.CarService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cars")
class CarController(carService: CarService) :
    BaseWithMobileController<Car, CarDto, CarMobileDto>(
        carService,
        Mappers.getMapper(CarMapper::class.java),
        Mappers.getMapper(CarMobileMapper::class.java)
    )