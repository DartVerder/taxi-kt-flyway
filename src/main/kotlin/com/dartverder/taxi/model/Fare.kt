package com.dartverder.taxi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "fare")
open class Fare : Identifiable() {

    @OneToOne(mappedBy = "fare", orphanRemoval = true)
    open var price: Price? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Column(name = "city", nullable = false)
    open var city: String? = null

    @Column(name = "price_for_distance", nullable = false)
    open var priceForDistance: Double? = null

    @Column(name = "price_for_waiting", nullable = false)
    open var priceForWaiting: Double? = null
}