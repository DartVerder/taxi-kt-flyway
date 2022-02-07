package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.AddressDto
import com.dartverder.taxi.model.Address
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class AddressMapper : BaseMapper<Address, AddressDto>() {

}