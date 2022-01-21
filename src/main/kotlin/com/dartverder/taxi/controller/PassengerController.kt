package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Passenger
import com.dartverder.taxi.service.PassengerService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("passengers")
class PassengerController(private val passengerService: PassengerService) :
    BaseController<Passenger>(passengerService) {
    override fun update(entity: Passenger, id: Long) {
        entity.id = id
        passengerService.save(entity)
    }

}