package com.dartverder.taxi.dto

import org.hibernate.validator.constraints.Range
import java.io.Serializable
import java.time.LocalDate

data class PassengerDto(
    var id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var dateOfBirth: LocalDate? = null,
    @field:Range(min = 2, max = 5) var rating: Double = 5.0,
    @field:Range(min = 0, max = 20) var discount: Double = 0.0
) : Serializable
