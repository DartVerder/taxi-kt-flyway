package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Trip
import com.dartverder.taxi.repository.TripRepository
import com.dartverder.taxi.service.TripService
import org.springframework.stereotype.Service

@Service
class TripServiceImpl(repository: TripRepository) : BaseServiceImpl<Trip>(repository), TripService