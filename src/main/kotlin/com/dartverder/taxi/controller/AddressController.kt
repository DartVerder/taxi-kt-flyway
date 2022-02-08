package com.dartverder.taxi.controller


import com.dartverder.taxi.dto.AddressDto
import com.dartverder.taxi.mapper.AddressMapper
import com.dartverder.taxi.model.Address
import com.dartverder.taxi.service.AddressService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("addresses")
class AddressController(addressService: AddressService) :
    BaseController<Address, AddressDto>(addressService, Mappers.getMapper(AddressMapper::class.java))