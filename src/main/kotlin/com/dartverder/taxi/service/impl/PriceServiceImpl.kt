package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Price
import com.dartverder.taxi.model.TripRequest
import com.dartverder.taxi.repository.PriceRepository
import com.dartverder.taxi.service.PriceService
import com.dartverder.taxi.service.TripRequestService
import org.springframework.stereotype.Service

@Service
class PriceServiceImpl(override val repository: PriceRepository, var tripRequestService: TripRequestService) :
    BaseServiceImpl<Price>(repository), PriceService {
    val maxCoefficient = 3.0

    override fun save(entity: Price) {
        val tripRequest: TripRequest = tripRequestService.findByPrice(entity)!!
        var range = 2.0
        var freeDriversCount = tripRequestService.findDriversAround(tripRequest, range).size.toDouble()
        entity.coefficient = (tripRequestService.findRequestsAround(tripRequest, range).size.toDouble())
        if (freeDriversCount == 0.0) {
            range = 3.0
            freeDriversCount = tripRequestService.findDriversAround(tripRequest, range).size.toDouble()
        }

        if (freeDriversCount != 0.0) {
            var coefficient =
                (tripRequestService.findRequestsAround(tripRequest, range).size.toDouble()) / freeDriversCount
            if (coefficient < 1.0)
                coefficient = 1.0
            else if (coefficient > 3.0)
                coefficient = 3.0
            entity.coefficient = coefficient
        } else
            entity.coefficient = maxCoefficient
        repository.save(entity)
    }

    override fun findByTripRequest(tripRequest: TripRequest): Price = repository.findByTripRequest(tripRequest)
}