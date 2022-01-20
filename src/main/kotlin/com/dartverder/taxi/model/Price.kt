package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "price")
open class Price : Identifiable() {

    @Column(name = "coefficient", nullable = false)
    open var coefficient: Double? = 1.0

    @Column(name = "waiting_time")
    open var waitingTime: Int? = null

    @Column(name = "full_price", nullable = false)
    open var fullPrice: Double? = null

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "fare_id")
    open var fare: Fare? = null

    @OneToOne(mappedBy = "price", orphanRemoval = true)
    open var tripRequest: TripRequest? = null
}