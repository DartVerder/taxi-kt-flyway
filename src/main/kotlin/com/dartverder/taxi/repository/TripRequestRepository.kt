package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Address
import com.dartverder.taxi.model.Price
import com.dartverder.taxi.model.TripRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TripRequestRepository : JpaRepository<TripRequest, Long> {

    @Query("select t from TripRequest t where t.isCancelled = true")
    fun findCancelledTripRequests(): List<TripRequest>

    @Query("select tripAddresses.address from TripRequest t left join t.tripAddresses tripAddresses " +
            "where t = ?1 and tripAddresses.orderInTrip = 0")
    fun findFromAddress(tripRequest: TripRequest): Address

    @Query("select t from TripRequest t where t.price = ?1")
    fun findByPrice(price: Price): TripRequest?


    fun findByTripIsNullAndIsCancelledIsFalse(): List<TripRequest>

}