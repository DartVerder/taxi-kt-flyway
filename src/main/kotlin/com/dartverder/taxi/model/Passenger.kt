package com.dartverder.taxi.model

import org.hibernate.validator.constraints.Range
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "passenger")
open class Passenger : User() {
    @Range(min = 0, max = 20)
    @Column(name = "discount", nullable = false)
    open var discount: Double = 0.0

    @OneToMany(mappedBy = "passenger", orphanRemoval = true)
    open var tripRequest: MutableList<TripRequest> = mutableListOf()
}