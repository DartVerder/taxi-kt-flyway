package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.DriverDto
import com.dartverder.taxi.model.Driver
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class DriverMapper : BaseMapper<Driver, DriverDto>()