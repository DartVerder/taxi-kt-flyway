package com.dartverder.taxi.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name = "payment")
open class Payment : Identifiable() {

    @Enumerated
    @Column(name = "payment_type", nullable = false)
    open var paymentType: PaymentType? = null

    @Column(name = "success", nullable = false)
    open var success: Boolean = false

    @Column(name = "payment_date", nullable = false)
    open var paymentDate: LocalDate? = null
}