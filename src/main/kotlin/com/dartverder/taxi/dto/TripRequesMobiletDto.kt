package com.dartverder.taxi.dto

import java.io.Serializable

data class TripRequesMobiletDto(
    var passenger: PassengerMobileDto? = null,
    var price: PriceMobileDto? = null,
    var isCancelled: Boolean = false
) : Serializable
