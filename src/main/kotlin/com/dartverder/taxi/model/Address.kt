package com.dartverder.taxi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "address")
open class Address : Identifiable() {

    @Column(name = "city")
    open var city: String? = null

    @Column(name = "street")
    open var street: String? = null

    @Column(name = "house_number", nullable = false)
    open var houseNumber: String? = null

    @Column(name = "enterance", nullable = false)
    open var enterance: Int? = null

    @OneToMany(mappedBy = "address", orphanRemoval = true)
    open var tripAddresses: MutableSet<TripAddresses> = mutableSetOf()
}