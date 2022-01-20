package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Position
import org.springframework.data.jpa.repository.JpaRepository

interface PositionRepository : JpaRepository<Position, Long>