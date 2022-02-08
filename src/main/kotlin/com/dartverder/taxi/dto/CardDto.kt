package com.dartverder.taxi.dto

import java.io.Serializable
import java.time.LocalDate

data class CardDto(
    var id: Long? = null,
    var cardNumber: String? = null,
    var expireDate: LocalDate? = null,
    var cvcCvv: Int? = null
) : Serializable
