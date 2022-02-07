package com.dartverder.taxi.dto

import com.dartverder.taxi.model.PaymentType
import java.io.Serializable
import java.time.LocalDate

data class PaymentDto(
    var id: Long? = null,
    var paymentType: PaymentType? = null,
    var success: Boolean = false,
    var paymentDate: LocalDate? = null
) : Serializable
