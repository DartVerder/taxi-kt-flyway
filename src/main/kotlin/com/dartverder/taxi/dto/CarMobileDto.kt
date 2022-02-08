package com.dartverder.taxi.dto

import java.io.Serializable

data class CarMobileDto(
    var licensePlate: String? = null,
    var colour: String? = null,
    var carModel: String? = null
) : Serializable

