package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Driver
import com.dartverder.taxi.model.Position
import com.dartverder.taxi.model.Price
import com.dartverder.taxi.model.TripRequest
import com.dartverder.taxi.repository.DriverRepository
import com.dartverder.taxi.repository.TripRequestRepository
import com.dartverder.taxi.service.TripRequestService
import org.springframework.stereotype.Service
import kotlin.math.asin
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

@Service
class TripRequestServiceImpl(override val repository: TripRequestRepository, val driversRepository: DriverRepository) :
    BaseServiceImpl<TripRequest>(repository),
    TripRequestService {
    override fun findActive() = repository.findByTripIsNullAndIsCancelledIsFalse()

    override fun findCancelled() = repository.findCancelledTripRequests()

    override fun findByPrice(price: Price): TripRequest? = repository.findByPrice(price)

    override fun findRequestsAround(tripRequest: TripRequest, range: Double): List<TripRequest> {
        val fromPosition = repository.findFromAddress(tripRequest).position!!
        val activeTripRequests = findActive()
        val tripRequestsAround: MutableList<TripRequest> = mutableListOf()
        var requestFromPosition: Position
        activeTripRequests.forEach { request ->
            requestFromPosition = repository.findFromAddress(request).position!!
            if (findDistance(fromPosition, requestFromPosition) < range)
                tripRequestsAround.add(request)
        }
        return tripRequestsAround
    }

    override fun findDriversAround(tripRequest: TripRequest, range: Double): List<Driver> {
        val fromPosition = repository.findFromAddress(tripRequest).position!!
        val freeDrivers = driversRepository.findFreeDrivers()
        val freeDriversAround: MutableList<Driver> = mutableListOf()
        freeDrivers.forEach { driver ->
            if (findDistance(fromPosition, driver.position!!) < range)
                freeDriversAround.add(driver)
        }
        return freeDriversAround

    }

    fun findDistance(from: Position, to: Position): Double {
        val r = 6371.0
        val sin1: Double = sin((from.latitude - to.latitude) / 2)
        val sin2: Double = sin((from.longitude - to.longitude) / 2)
        return 2 * r * asin(sqrt(sin1 * sin1 + sin2 * sin2 * cos(from.latitude) * cos(to.latitude)))
    }
}
