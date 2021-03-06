package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.TripRequestDto
import com.dartverder.taxi.model.TripRequest
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class TripRequestMapper : BaseMapper<TripRequest, TripRequestDto>()