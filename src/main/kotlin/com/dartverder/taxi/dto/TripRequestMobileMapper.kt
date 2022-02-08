package com.dartverder.taxi.dto

import com.dartverder.taxi.mapper.MobileMapper
import com.dartverder.taxi.model.TripRequest
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class TripRequestMobileMapper : MobileMapper<TripRequest, TripRequesMobiletDto>()