package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.CarMobileDto
import com.dartverder.taxi.dto.CardDto
import com.dartverder.taxi.mapper.CardMapper
import com.dartverder.taxi.mapper.CardMobileMapper
import com.dartverder.taxi.model.Card
import com.dartverder.taxi.service.CardService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cards")
class CardController(cardService: CardService) : BaseWithMobileController<Card, CardDto, CarMobileDto>(
    cardService, Mappers.getMapper(CardMapper::class.java), Mappers.getMapper(CardMobileMapper::class.java)
)