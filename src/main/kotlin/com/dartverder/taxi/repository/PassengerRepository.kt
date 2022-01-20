package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Passenger
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface PassengerRepository : JpaRepository<Passenger, Long> {

    @Query(
        "select p from Passenger p left join p.tripRequest tripRequest " +
                "where p.discount < ?1 and count(tripRequest.trip.id) >= ?2"
    )
    fun passengersToIncreaseDiscount(minDiscount: Double, tripLimit: Int): List<Passenger>

}