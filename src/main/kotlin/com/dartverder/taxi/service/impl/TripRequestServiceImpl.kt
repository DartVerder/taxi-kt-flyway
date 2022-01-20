package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.TripRequest
import com.dartverder.taxi.repository.TripRequestRepository
import com.dartverder.taxi.service.TripRequestService
import org.springframework.stereotype.Service

@Service
class TripRequestServiceImpl(repository: TripRequestRepository) : BaseServiceImpl<TripRequest>(repository),
    TripRequestService