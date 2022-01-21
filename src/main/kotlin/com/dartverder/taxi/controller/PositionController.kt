package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Position
import com.dartverder.taxi.service.PositionService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("positions")
class PositionController(private val positionService: PositionService) : BaseController<Position>(positionService) {
    override fun update(entity: Position, id: Long) {
        entity.id = id
        positionService.save(entity)
    }

}