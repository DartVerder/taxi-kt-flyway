package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.PassengerDto
import com.dartverder.taxi.dto.PassengerMobileDto
import com.dartverder.taxi.mapper.PassengerMapper
import com.dartverder.taxi.mapper.PassengerMobileMapper
import com.dartverder.taxi.model.Passenger
import com.dartverder.taxi.service.PassengerService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("passengers")
class PassengerController(passengerService: PassengerService) :
    BaseWithMobileController<Passenger, PassengerDto, PassengerMobileDto>(
        passengerService,
        Mappers.getMapper(PassengerMapper::class.java),
        Mappers.getMapper(PassengerMobileMapper::class.java)
    )