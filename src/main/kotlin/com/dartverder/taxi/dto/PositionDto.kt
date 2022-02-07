package com.dartverder.taxi.dto

import java.io.Serializable

data class PositionDto(var id: Long? = null, var latitude: Double? = null, var longitude: Double? = null) : Serializable
