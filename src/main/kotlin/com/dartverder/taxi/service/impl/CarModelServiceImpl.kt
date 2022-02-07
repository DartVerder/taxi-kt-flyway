package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.CarModel
import com.dartverder.taxi.repository.CarModelRepository
import com.dartverder.taxi.service.CarModelService
import org.springframework.stereotype.Service

@Service
class CarModelServiceImpl(repository: CarModelRepository) : BaseServiceImpl<CarModel>(repository), CarModelService