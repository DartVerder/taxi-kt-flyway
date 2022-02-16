package com.dartverder.taxi.service

import com.dartverder.taxi.model.Driver
import com.dartverder.taxi.model.Price
import com.dartverder.taxi.model.TripRequest

interface TripRequestService : BaseService<TripRequest> {
    fun findActive(): List<TripRequest>?

    fun findCancelled(): List<TripRequest>?

    fun findByPrice(price: Price): TripRequest?

    fun findRequestsAround(tripRequest: TripRequest, range: Double): List<TripRequest>

    fun findDriversAround(tripRequest: TripRequest, range: Double): List<Driver>
}