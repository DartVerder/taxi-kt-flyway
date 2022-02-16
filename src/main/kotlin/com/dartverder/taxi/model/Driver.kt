package com.dartverder.taxi.model

import javax.persistence.*

@Entity
@Table(name = "driver")
open class Driver: User(){
    @Column(name = "drivers_license", nullable = false, unique = true)
    open var driversLicense: String? = null

    @Column(name = "certification_level")
    open var certificationLevel: Int? = null

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "position_id")
    open var position: Position? = null

    @OneToMany(mappedBy = "driver", orphanRemoval = true)
    open var car: MutableSet<Car> = mutableSetOf()

    @ManyToOne
    @JoinColumn(name = "driver_id")
    open var driver: Driver? = null

    @OneToMany(mappedBy = "driver", orphanRemoval = true)
    open var trips: MutableSet<Trip> = mutableSetOf()
}