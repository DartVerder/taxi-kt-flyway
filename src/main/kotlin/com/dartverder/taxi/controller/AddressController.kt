package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Address
import com.dartverder.taxi.service.AddressService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("addresses")
class AddressController(private val addressService: AddressService) : BaseController<Address>(addressService) {
    override fun update(entity: Address, id: Long) {
        entity.id = id
        addressService.save(entity)
    }

}