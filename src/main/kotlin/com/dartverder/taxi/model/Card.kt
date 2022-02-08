package com.dartverder.taxi.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "card")
open class Card(
    @Column(name = "card_number", nullable = false, unique = true)
    open var cardNumber: String,

    @Column(name = "expire_date", nullable = false)
    open var expireDate: LocalDate,

    @Column(name = "cvc_cvv", nullable = false)
    open var cvcCvv: Int
) : Identifiable()