package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "fare")
open class Fare : Identifiable() {



    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Column(name = "city", nullable = false)
    open var city: String? = null

    @Column(name = "price_for_distance", nullable = false)
    open var priceForDistance: Double = 50.0

    @Column(name = "price_for_waiting", nullable = false)
    open var priceForWaiting: Double = 5.0

    @OneToMany(mappedBy = "fare", orphanRemoval = true)
    open var prices: MutableList<Price> = mutableListOf()
}