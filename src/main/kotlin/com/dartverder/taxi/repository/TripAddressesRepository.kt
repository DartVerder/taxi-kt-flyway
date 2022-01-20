package com.dartverder.taxi.repository

import com.dartverder.taxi.model.TripAddresses
import org.springframework.data.jpa.repository.JpaRepository

interface TripAddressesRepository : JpaRepository<TripAddresses, Long>