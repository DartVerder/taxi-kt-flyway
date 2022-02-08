package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.FareDto
import com.dartverder.taxi.mapper.FareMapper
import com.dartverder.taxi.model.Fare
import com.dartverder.taxi.service.FareService
import org.mapstruct.factory.Mappers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("fares")
class FareController(fareService: FareService) :
    BaseController<Fare, FareDto>(fareService, Mappers.getMapper(FareMapper::class.java))