package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.CarDto
import com.dartverder.taxi.model.Car
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class CarMapper : BaseMapper<Car, CarDto>()