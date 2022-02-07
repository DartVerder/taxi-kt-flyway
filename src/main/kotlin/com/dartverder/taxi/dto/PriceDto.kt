package com.dartverder.taxi.dto

import java.io.Serializable

data class PriceDto(var id: Long? = null, var waitingTime: Int = 0, var fullPrice: Double? = 0.0) : Serializable
