package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Trip
import com.dartverder.taxi.service.TripService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("trips")
class TripController(private val tripService: TripService) : BaseController<Trip>(tripService) {
    override fun update(entity: Trip, id: Long) {
        entity.id = id
        tripService.save(entity)
    }

}