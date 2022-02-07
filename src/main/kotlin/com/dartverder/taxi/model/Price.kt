package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "price")
open class Price(
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "fare_id", nullable = false)
    open var fare: Fare,

    @OneToOne(mappedBy = "price", orphanRemoval = true)
    open var tripRequest: TripRequest
) : Identifiable() {

    @Transient
    open var coefficient: Double = 1.0
    //TODO calculate the coefficient

    @Column(name = "waiting_time")
    open var waitingTime: Int = 0

    @Column(name = "full_price", nullable = false)
    open var fullPrice: Double? = 0.0
        get() = waitingTime * fare.priceForWaiting + coefficient * fare.priceForDistance * tripRequest.distance
        protected set

    private fun priceCalc ()
    {
        this.fullPrice = waitingTime * fare.priceForWaiting + coefficient * fare.priceForDistance * tripRequest.distance
    }

    @PrePersist
    @PreUpdate
    open fun prePersist() {
        priceCalc()
    }

}