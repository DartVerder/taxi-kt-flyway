package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Fare
import com.dartverder.taxi.repository.FareRepository
import com.dartverder.taxi.service.FareService
import org.springframework.stereotype.Service

@Service
class FareServiceImpl(repository: FareRepository) : BaseServiceImpl<Fare>(repository), FareService