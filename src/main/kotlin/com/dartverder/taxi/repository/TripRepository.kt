package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Trip
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDateTime

interface TripRepository : JpaRepository<Trip, Long> {

    @Query("select t from Trip t where t.tripRequest.datetimeOfCreation >= ?1")
    fun tripsAfterSelectedDate(selectedDate: LocalDateTime): Set<Trip>
}