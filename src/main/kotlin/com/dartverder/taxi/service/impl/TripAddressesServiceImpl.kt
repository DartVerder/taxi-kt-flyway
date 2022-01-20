package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.TripAddresses
import com.dartverder.taxi.repository.TripAddressesRepository
import com.dartverder.taxi.service.TripAddressesService
import org.springframework.stereotype.Service

@Service
class TripAddressesServiceImpl(repository: TripAddressesRepository) : BaseServiceImpl<TripAddresses>(repository),
    TripAddressesService