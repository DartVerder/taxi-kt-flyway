package com.dartverder.taxi.dto

import java.io.Serializable

data class CarDto(var licensePlate: String? = null, var colour: String? = null, var carModel: CarModelDto? = null) :
    Serializable {
    data class CarModelDto(var model: String? = null, var brand: String? = null) : Serializable
}
