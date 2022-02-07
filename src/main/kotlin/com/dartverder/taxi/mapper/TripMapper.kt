package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.TripDto
import com.dartverder.taxi.model.Trip
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class TripMapper:BaseMapper<Trip, TripDto>() {

}