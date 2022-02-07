package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.TripRequestDto
import com.dartverder.taxi.mapper.TripRequestMapper
import com.dartverder.taxi.model.TripRequest
import com.dartverder.taxi.service.TripRequestService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tripRequests")
class TripRequestRequestController(private val tripRequestService: TripRequestService) :
    BaseController<TripRequest, TripRequestDto>(tripRequestService, Mappers.getMapper(TripRequestMapper::class.java)) {

}