package com.dartverder.taxi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "address")
open class Address(
    @Column(name = "house_number", nullable = false)
    open var houseNumber: String,
    @Column(name = "street", nullable = false)
    open var street: String,
    @Column(name = "city", nullable = false)
    open var city: String
) : Identifiable() {

    @Column(name = "entrance")
    open var entrance: Int? = null

    @OneToMany(mappedBy = "address", orphanRemoval = true)
    open var tripAddresses: MutableSet<TripAddresses> = mutableSetOf()
}