package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.CardDto
import com.dartverder.taxi.model.Card
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class CardMapper : BaseMapper<Card, CardDto>()