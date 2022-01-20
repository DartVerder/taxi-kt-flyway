package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Long>