package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.PriceDto
import com.dartverder.taxi.model.Price
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class PriceMapper : BaseMapper<Price, PriceDto>() {

}