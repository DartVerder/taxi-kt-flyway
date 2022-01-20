package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Car
import org.springframework.data.jpa.repository.JpaRepository

interface CarRepository : JpaRepository<Car, Long>