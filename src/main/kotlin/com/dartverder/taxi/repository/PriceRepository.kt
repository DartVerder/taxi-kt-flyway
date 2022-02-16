package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Price
import com.dartverder.taxi.model.TripRequest
import org.springframework.data.jpa.repository.JpaRepository

interface PriceRepository : JpaRepository<Price, Long> {

    fun findByTripRequest(tripRequest: TripRequest): Price

}