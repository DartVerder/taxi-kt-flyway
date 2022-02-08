package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.CarMobileDto
import com.dartverder.taxi.model.Card
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class CardMobileMapper : MobileMapper<Card, CarMobileDto>()