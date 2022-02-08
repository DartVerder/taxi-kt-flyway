package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.DriverMobileDto
import com.dartverder.taxi.dto.PassengerMobileDto
import com.dartverder.taxi.model.Driver
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class DriverMobileMapper : MobileMapper<Driver, DriverMobileDto>() {

    @Mapping(target = "name", ignore = true)
    abstract override fun entityToDto(entity: Driver): DriverMobileDto

    @AfterMapping
    fun setNameDto(@MappingTarget driverMobileDto: PassengerMobileDto, driver: Driver) {

        driverMobileDto.name = driver.lastName + " " + driver.firstName
    }

}