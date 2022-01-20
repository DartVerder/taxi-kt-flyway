package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Passenger
import com.dartverder.taxi.repository.PassengerRepository
import com.dartverder.taxi.service.PassengerService
import org.springframework.stereotype.Service

@Service
class PassengerServiceImpl(repository: PassengerRepository) : BaseServiceImpl<Passenger>(repository), PassengerService