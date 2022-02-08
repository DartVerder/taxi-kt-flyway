package com.dartverder.taxi.repository

import com.dartverder.taxi.model.TripRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TripRequestRepository : JpaRepository<TripRequest, Long> {
    @Query("select t from TripRequest t where t.isCancelled = false and t.trip.id is null")
    fun findActiveTripRequests(): List<TripRequest>

    @Query("select t from TripRequest t where t.isCancelled = true")
    fun findCancelledTripRequests(): List<TripRequest>
}