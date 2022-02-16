package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "price")
open class Price : Identifiable() {


    @OneToOne(mappedBy = "price", orphanRemoval = true)
    open var tripRequest: TripRequest? = null

    @Transient
    open var coefficient: Double = 1.0
    //calculating

    @Column(name = "waiting_time")
    open var waitingTime: Int = 0

    @Column(name = "full_price", nullable = false)
    open var fullPrice: Double = 0.0
        protected set

    @ManyToOne
    @JoinColumn(name = "fare_id")
    open var fare: Fare? = null

    private fun priceCalc() {
        this.fullPrice = waitingTime * fare!!.priceForWaiting + coefficient * fare!!.priceForDistance * tripRequest!!.distance
    }

    @PrePersist
    @PreUpdate
    open fun prePersist() {
        priceCalc()
    }

}