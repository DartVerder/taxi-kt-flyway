package com.dartverder.taxi.service

import com.dartverder.taxi.model.TripRequest

interface TripRequestService : BaseService<TripRequest> {
    fun findActive(): List<TripRequest>?

    fun findCancelled(): List<TripRequest>?
}