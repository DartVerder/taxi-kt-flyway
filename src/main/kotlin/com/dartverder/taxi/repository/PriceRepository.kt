package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Price
import org.springframework.data.jpa.repository.JpaRepository

interface PriceRepository : JpaRepository<Price, Long>