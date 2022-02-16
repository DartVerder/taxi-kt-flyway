package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.CarMobileDto
import com.dartverder.taxi.model.Car
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class CarMobileMapper : MobileMapper<Car, CarMobileDto>() {

    @Mapping(target = "carModel", ignore = true)
    abstract override fun entityToDto(entity: Car): CarMobileDto

    @AfterMapping
    fun setCarModelDto(@MappingTarget carMobileDto: CarMobileDto, car: Car) {
        val carModel = car.carModel
        carMobileDto.carModel = carModel?.brand + " " + carModel?.model
    }

}