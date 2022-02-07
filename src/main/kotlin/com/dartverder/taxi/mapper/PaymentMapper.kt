package com.dartverder.taxi.mapper

import com.dartverder.taxi.dto.PaymentDto
import com.dartverder.taxi.model.Payment
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class PaymentMapper : BaseMapper<Payment, PaymentDto>() {

}