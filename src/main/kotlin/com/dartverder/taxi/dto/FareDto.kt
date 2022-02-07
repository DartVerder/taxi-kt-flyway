package com.dartverder.taxi.dto

import java.io.Serializable

data class FareDto(
    var name: String? = null,
    var city: String? = null,
    var priceForDistance: Double = 50.0,
    var priceForWaiting: Double = 5.0
) : Serializable
