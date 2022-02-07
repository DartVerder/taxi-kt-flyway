package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "price")
open class Price(
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "fare_id", nullable = false)
    open var fare: Fare
) : Identifiable() {

    @Transient
    open var coefficient: Double = 1.0
        protected set
    //TODO calculate the coefficient

    @Column(name = "waiting_time")
    open var waitingTime: Int = 0

    @Column(name = "full_price", nullable = false)
    open var fullPrice: Double? = 0.0
        get() = waitingTime * fare.priceForWaiting + coefficient * fare.priceForDistance //TODO * distance
        protected set

    @OneToOne(mappedBy = "price", orphanRemoval = true)
    open var tripRequest: TripRequest? = null
}