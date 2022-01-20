package com.dartverder.taxi.service.impl

import com.dartverder.taxi.model.Payment
import com.dartverder.taxi.repository.PaymentRepository
import com.dartverder.taxi.service.PaymentService
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl(repository: PaymentRepository) : BaseServiceImpl<Payment>(repository), PaymentService