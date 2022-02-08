package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.PassengerDto
import com.dartverder.taxi.model.Passenger
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class PassengerMapper : BaseMapper<Passenger, PassengerDto>()