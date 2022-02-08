package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.FareDto
import com.dartverder.taxi.model.Fare
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class FareMapper : BaseMapper<Fare, FareDto>()