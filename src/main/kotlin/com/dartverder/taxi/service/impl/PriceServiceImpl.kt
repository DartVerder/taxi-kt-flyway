package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Price
import com.dartverder.taxi.repository.PriceRepository
import com.dartverder.taxi.service.PriceService
import org.springframework.stereotype.Service

@Service
class PriceServiceImpl(repository: PriceRepository) : BaseServiceImpl<Price>(repository), PriceService