package com.dartverder.taxi.dto

import java.io.Serializable

data class TripMobileDto(
    var fullPrice: Double? = 0.0,
    var passengerName: String? = null,
    var driverName: String? = null
) : Serializable {
    data class DriverDto(var car: MutableSet<CarMobileDto> = mutableSetOf()) : Serializable
}