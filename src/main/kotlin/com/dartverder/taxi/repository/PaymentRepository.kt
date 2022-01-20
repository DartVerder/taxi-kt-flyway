package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long>