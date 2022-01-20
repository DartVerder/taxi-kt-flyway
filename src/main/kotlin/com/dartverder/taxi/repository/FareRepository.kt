package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Fare
import org.springframework.data.jpa.repository.JpaRepository

interface FareRepository : JpaRepository<Fare, Long>