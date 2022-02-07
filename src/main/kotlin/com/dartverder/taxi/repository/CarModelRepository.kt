package com.dartverder.taxi.repository;

import com.dartverder.taxi.model.CarModel
import org.springframework.data.jpa.repository.JpaRepository

interface CarModelRepository : JpaRepository<CarModel, Long> {
}