package com.dartverder.taxi.dto

import java.io.Serializable

data class AddressDto(
    var houseNumber: String? = null,
    var street: String? = null,
    var city: String? = null,
    var entrance: Int? = null
) : Serializable
