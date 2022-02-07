package com.dartverder.taxi.dto

import org.hibernate.validator.constraints.Range
import java.io.Serializable
import java.time.LocalDate

data class DriverDto(
    var firstName: String? = null,
    var lastName: String? = null,
    var dateOfBirth: LocalDate? = null,
    @field:Range(min = 2, max = 5) var rating: Double = 5.0,
    var driversLicense: String? = null
) : Serializable
