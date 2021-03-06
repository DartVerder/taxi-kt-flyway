package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Position
import com.dartverder.taxi.repository.PositionRepository
import com.dartverder.taxi.service.PositionService
import org.springframework.stereotype.Service

@Service
class PositionServiceImpl(repository: PositionRepository) : BaseServiceImpl<Position>(repository), PositionService