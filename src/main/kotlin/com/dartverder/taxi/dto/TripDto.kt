package com.dartverder.taxi.dto

import java.io.Serializable
import java.time.LocalDateTime

data class TripDto(
    var id: Long? = null,
    var tripRequest: TripRequestDto? = null,
    var driver: DriverDto? = null,
    var payment: PaymentDto? = null,
    var arrivingDatetime: LocalDateTime? = null,
    var startTripDatetime: LocalDateTime? = null,
    var endTripDatetime: LocalDateTime? = null,
    var tripAddresses: MutableList<TripAddressesDto> = mutableListOf(),
) : Serializable {
    data class TripAddressesDto(var id: Long? = null, var orderInTrip: Int? = null, var address: AddressDto? = null) :
        Serializable
}
