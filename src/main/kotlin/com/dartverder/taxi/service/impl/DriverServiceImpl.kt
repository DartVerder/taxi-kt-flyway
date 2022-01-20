package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Driver
import com.dartverder.taxi.repository.DriverRepository
import com.dartverder.taxi.service.DriverService
import org.springframework.stereotype.Service

@Service
class DriverServiceImpl(repository: DriverRepository) : BaseServiceImpl<Driver>(repository), DriverService