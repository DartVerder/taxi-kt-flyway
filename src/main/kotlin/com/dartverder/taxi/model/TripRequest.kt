package com.dartverder.taxi.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "trip_request")
open class TripRequest : Identifiable() {

    @Column(name = "datetime_of_creation", nullable = false)
    open var datetimeOfCreation: LocalDateTime? = null

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "price_id", nullable = false)
    open var price: Price? = null

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    open var passenger: Passenger? = null


    @OneToOne(mappedBy = "tripRequest", orphanRemoval = true)
    open var trip: Trip? = null
}