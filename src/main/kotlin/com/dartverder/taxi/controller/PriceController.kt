package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Price
import com.dartverder.taxi.service.PriceService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("prices")
class PriceController(private val priceService: PriceService) : BaseController<Price>(priceService) {
    override fun update(entity: Price, id: Long) {
        entity.id = id
        priceService.save(entity)
    }

}