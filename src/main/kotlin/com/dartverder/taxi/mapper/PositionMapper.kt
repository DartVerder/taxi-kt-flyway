package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.PositionDto
import com.dartverder.taxi.model.Position
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class PositionMapper : BaseMapper<Position, PositionDto>() {
}