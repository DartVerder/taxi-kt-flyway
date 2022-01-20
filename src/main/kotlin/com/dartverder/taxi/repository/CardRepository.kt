package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Card
import org.springframework.data.jpa.repository.JpaRepository

interface CardRepository : JpaRepository<Card, Long>