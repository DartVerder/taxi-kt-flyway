package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.TripRequestDto
import com.dartverder.taxi.model.TripRequest
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class TripRequestMapper : BaseMapper<TripRequest, TripRequestDto>(){
/*
    abstract fun tripRequestDtoToTripRequest(tripRequestDto: TripRequestDto): TripRequest

    abstract fun tripRequestToTripRequestDto(tripRequest: TripRequest): TripRequestDto

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun updateTripRequestFromTripRequestDto(
        tripRequestDto: TripRequestDto,
        @MappingTarget tripRequest: TripRequest
    )*/
}