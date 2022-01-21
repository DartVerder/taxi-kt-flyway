package com.dartverder.taxi.controller

import com.dartverder.taxi.model.TripAddresses
import com.dartverder.taxi.service.TripAddressesService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tripAddresses")
class TripAddressesAddressesController(private val tripAddressesService: TripAddressesService) :
    BaseController<TripAddresses>(tripAddressesService) {
    override fun update(entity: TripAddresses, id: Long) {
        entity.id = id
        tripAddressesService.save(entity)
    }

}