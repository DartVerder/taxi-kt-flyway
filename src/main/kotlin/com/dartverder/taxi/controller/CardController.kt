package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.CardReadDto
import com.dartverder.taxi.mapper.CardMapper
import com.dartverder.taxi.model.Card
import com.dartverder.taxi.service.CardService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cards")
class CardController(private val cardService: CardService) :
    BaseController<Card, CardReadDto>(cardService, Mappers.getMapper(CardMapper::class.java)) {


}