package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Fare
import com.dartverder.taxi.service.FareService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("fares")
class FareController(private val fareService: FareService) : BaseController<Fare>(fareService) {
}