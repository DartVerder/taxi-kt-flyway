package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.PositionDto
import com.dartverder.taxi.mapper.PositionMapper
import com.dartverder.taxi.model.Position
import com.dartverder.taxi.service.PositionService
import org.mapstruct.factory.Mappers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("positions")
class PositionController(private val positionService: PositionService) :
    BaseController<Position, PositionDto>(positionService, Mappers.getMapper(PositionMapper::class.java)) {
}