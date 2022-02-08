package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.TripDto
import com.dartverder.taxi.dto.TripMobileDto
import com.dartverder.taxi.mapper.TripMapper
import com.dartverder.taxi.mapper.TripMobileMapper
import com.dartverder.taxi.model.Trip
import com.dartverder.taxi.service.TripService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("trips")
class TripController(tripService: TripService) :
    BaseWithMobileController<Trip, TripDto, TripMobileDto>(
        tripService,
        Mappers.getMapper(TripMapper::class.java),
        Mappers.getMapper(TripMobileMapper::class.java)
    )
