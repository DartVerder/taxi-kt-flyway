package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Driver
import com.dartverder.taxi.service.DriverService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("drivers")
class DriverController(private val driverService: DriverService) : BaseController<Driver>(driverService) {
    override fun update(entity: Driver, id: Long) {
        entity.id = id
        driverService.save(entity)
    }

}