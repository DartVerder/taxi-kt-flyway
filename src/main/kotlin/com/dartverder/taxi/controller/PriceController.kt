package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.PriceDto
import com.dartverder.taxi.dto.PriceMobileDto
import com.dartverder.taxi.mapper.PriceMapper
import com.dartverder.taxi.mapper.PriceMobileMapper
import com.dartverder.taxi.model.Price
import com.dartverder.taxi.service.PriceService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("prices")
class PriceController(priceService: PriceService) : BaseWithMobileController<Price, PriceDto, PriceMobileDto>(
    priceService, Mappers.getMapper(PriceMapper::class.java), Mappers.getMapper(PriceMobileMapper::class.java)
)