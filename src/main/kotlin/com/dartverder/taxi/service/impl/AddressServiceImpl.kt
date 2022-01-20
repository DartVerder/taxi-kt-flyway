package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Address
import com.dartverder.taxi.repository.AddressRepository
import com.dartverder.taxi.service.AddressService
import org.springframework.stereotype.Service

@Service
class AddressServiceImpl(repository: AddressRepository) : BaseServiceImpl<Address>(repository), AddressService