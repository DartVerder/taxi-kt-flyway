package com.dartverder.taxi.controller

import com.dartverder.taxi.dto.PaymentDto
import com.dartverder.taxi.mapper.PassengerMapper
import com.dartverder.taxi.mapper.PaymentMapper
import com.dartverder.taxi.model.Payment
import com.dartverder.taxi.service.PaymentService
import org.mapstruct.factory.Mappers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("payments")
class PaymentController(private val paymentService: PaymentService) : BaseController<Payment, PaymentDto>(paymentService, Mappers.getMapper(PaymentMapper::class.java)) {

}