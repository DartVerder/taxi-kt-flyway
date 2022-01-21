package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Car
import com.dartverder.taxi.repository.CarRepository
import com.dartverder.taxi.service.CarService
import org.springframework.stereotype.Service

@Service
class CarServiceImpl(repository: CarRepository) : BaseServiceImpl<Car>(repository), CarService