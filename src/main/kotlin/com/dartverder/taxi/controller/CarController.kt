package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Car
import com.dartverder.taxi.service.CarService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cars")
class CarController(private val carService: CarService) : BaseController<Car>(carService) {
    override fun update(entity: Car, id: Long) {
        entity.id = id
        carService.save(entity)
    }

}