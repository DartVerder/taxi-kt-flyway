package com.dartverder.taxi.dto

import org.hibernate.validator.constraints.Range
import java.io.Serializable

data class DriverMobileDto(
    var name: String? = null,
    @field:Range(min = 2, max = 5) var rating: Double = 5.0,
    var driversLicense: String? = null
) : Serializable
