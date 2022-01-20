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
    @Column(name = "discount")
    open var discount: Double? = null

    @OneToMany(mappedBy = "passenger", orphanRemoval = true)
    open var tripRequest: MutableList<TripRequest> = mutableListOf()
}