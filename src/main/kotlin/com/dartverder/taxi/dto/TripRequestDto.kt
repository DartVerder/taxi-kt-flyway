package com.dartverder.taxi.dto

import java.io.Serializable
import java.time.LocalDateTime

data class TripRequestDto(
    var id: Long? = null,
    var datetimeOfCreation: LocalDateTime? = null,
    var price: PriceDto? = null,
    var passenger: PassengerDto? = null,
    var isCancelled: Boolean = false
) : Serializable
