package com.dartverder.taxi.model

import org.hibernate.Hibernate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "trip")
open class Trip : Identifiable() {

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "trip_request_id", nullable = false)
    open var tripRequest: TripRequest? = null

    @ManyToOne(optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    open var driver: Driver? = null

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "payment_id", nullable = false)
    open var payment: Payment? = null

    @Column(name = "arriving_datetime", nullable = false)
    open var arrivingDatetime: LocalDateTime? = null

    @Column(name = "start_trip_datetime", nullable = false)
    open var startTripDatetime: LocalDateTime? = null

    @Column(name = "end_trip_datetime", nullable = false)
    open var endTripDatetime: LocalDateTime? = null


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Trip

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()
}