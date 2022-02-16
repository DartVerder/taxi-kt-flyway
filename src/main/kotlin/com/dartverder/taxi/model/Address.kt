package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "address")
open class Address: Identifiable() {

    @Column(name = "house_number", nullable = false)
    open var houseNumber: String? = null

    @Column(name = "street", nullable = false)
    open var street: String? = null

    @Column(name = "city", nullable = false)
    open var city: String? = null

    @Column(name = "entrance")
    open var entrance: Int? = null

    @OneToMany(mappedBy = "address", orphanRemoval = true)
    open var tripAddresses: MutableSet<TripAddresses> = mutableSetOf()

    @ManyToOne
    @JoinColumn(name = "position_id")
    open var position: Position? = null
}