package com.dartverder.taxi.service

import com.dartverder.taxi.model.Price
import com.dartverder.taxi.model.TripRequest

interface PriceService : BaseService<Price> {
    fun findByTripRequest(tripRequest: TripRequest): Price
}