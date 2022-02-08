package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.PassengerMobileDto
import com.dartverder.taxi.model.Passenger
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class PassengerMobileMapper : MobileMapper<Passenger, PassengerMobileDto>() {

    @Mapping(target = "name", ignore = true)
    abstract override fun entityToDto(entity: Passenger): PassengerMobileDto

    @AfterMapping
    fun setNameDto(@MappingTarget passengerMobileDto: PassengerMobileDto, passenger: Passenger) {

        passengerMobileDto.name = passenger.lastName + " " + passenger.firstName
    }

}