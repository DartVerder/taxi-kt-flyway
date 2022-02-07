package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.TripRequest
import com.dartverder.taxi.repository.TripRequestRepository
import com.dartverder.taxi.service.TripRequestService
import org.springframework.stereotype.Service

@Service
class TripRequestServiceImpl(override val repository: TripRequestRepository) : BaseServiceImpl<TripRequest>(repository),
    TripRequestService {
    override fun findActive() = repository.findActiveTripRequests()

    override fun findCancelled() = repository.findCancelledTripRequests()
}
