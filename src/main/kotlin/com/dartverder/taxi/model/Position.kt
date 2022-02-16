package com.dartverder.taxi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "position")
open class Position : Identifiable() {

    @Column(name = "latitude", nullable = false)
    open var latitude: Double = 0.0

    @Column(name = "longitude", nullable = false)
    open var longitude: Double = 0.0

    @OneToOne(mappedBy = "position", optional = false, orphanRemoval = true)
    open var driver: Driver? = null
}