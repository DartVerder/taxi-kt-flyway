package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Card
import com.dartverder.taxi.repository.CardRepository
import com.dartverder.taxi.service.CardService
import org.springframework.stereotype.Service

@Service
class CardServiceImpl(repository: CardRepository) : BaseServiceImpl<Card>(repository), CardService