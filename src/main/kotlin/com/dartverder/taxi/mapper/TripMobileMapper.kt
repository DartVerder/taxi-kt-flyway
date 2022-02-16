package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.TripMobileDto
import com.dartverder.taxi.model.Trip
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class TripMobileMapper : MobileMapper<Trip, TripMobileDto>() {

    @Mappings(
        Mapping(target = "fullPrice", ignore = true),
        Mapping(target = "passengerName", ignore = true),
        Mapping(target = "driverName", ignore = true)
    )
    abstract override fun entityToDto(entity: Trip): TripMobileDto

    @AfterMapping
    fun setCustomFieldsDto(@MappingTarget tripMobileDto: TripMobileDto, trip: Trip) {
        val passenger = trip.tripRequest?.passenger
        tripMobileDto.passengerName = passenger?.firstName + " " + passenger?.lastName
        val driver = trip.driver
        tripMobileDto.driverName = driver?.firstName + " " + driver?.lastName
        tripMobileDto.fullPrice = trip.tripRequest?.price?.fullPrice
    }

}