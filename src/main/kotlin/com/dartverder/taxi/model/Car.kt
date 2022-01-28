package com.dartverder.taxi.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "car")
open class Car : Identifiable() {

    @Column(name = "colour", nullable = false)
    open var colour: String? = null

    @Column(name = "production_date", nullable = false)
    open var productionDate: LocalDate? = null

    @Column(name = "comfort_class", nullable = false)
    open var comfortClass: Int? = null

    @Column(name = "license_plate", nullable = false, length = 12)
    open var licensePlate: String? = null

    @Column(name = "child_safety_seat")
    open var childSafetySeat: Int? = null

    @ManyToOne(optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    open var driver: Driver? = null

    @ManyToOne
    @JoinColumn(name = "car_model_id")
    open var carModel: CarModel? = null
}