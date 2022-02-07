package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "trip_addresses")
open class TripAddresses : Identifiable() {

    @Column(name = "order_in_trip", nullable = false)
    open var orderInTrip: Int? = null

    @ManyToOne
    @JoinColumn(name = "address_id")
    open var address: Address? = null

    @ManyToOne
    @JoinColumn(name = "trip_id")
    open var trip: Trip? = null
}