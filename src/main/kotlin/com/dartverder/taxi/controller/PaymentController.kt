package com.dartverder.taxi.controller

import com.dartverder.taxi.model.Payment
import com.dartverder.taxi.service.PaymentService

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("payments")
class PaymentController(private val paymentService: PaymentService) : BaseController<Payment>(paymentService) {

}