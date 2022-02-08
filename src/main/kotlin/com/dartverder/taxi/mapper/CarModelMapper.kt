package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.CarModelDto
import com.dartverder.taxi.model.CarModel
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class CarModelMapper : BaseMapper<CarModel, CarModelDto>()