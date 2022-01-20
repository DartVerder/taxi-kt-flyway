package com.dartverder.taxi.repository

import com.dartverder.taxi.model.TripRequest
import org.springframework.data.jpa.repository.JpaRepository

interface TripRequestRepository : JpaRepository<TripRequest, Long>