package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.DriverDto
import com.dartverder.taxi.mapper.DriverMapper
import com.dartverder.taxi.model.Driver
import com.dartverder.taxi.service.DriverService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("drivers")
class DriverController(driverService: DriverService) :
    BaseController<Driver, DriverDto>(driverService, Mappers.getMapper(DriverMapper::class.java)) {
}