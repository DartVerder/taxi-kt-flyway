package com.dartverder.taxi.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "car")
open class Car(
    @Column(name = "license_plate", nullable = false, length = 12)
    open var licensePlate: kotlin.String,

    @ManyToOne(optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    open var driver: com.dartverder.taxi.model.Driver,

    @Column(name = "colour", nullable = false)
    open var colour: kotlin.String,

    @ManyToOne(optional = false)
    @JoinColumn(name = "car_model_id", nullable = false)
    open var carModel: CarModel
) : Identifiable() {

    @Column(name = "production_date")
    open var productionDate: LocalDate? = null

    @Column(name = "comfort_class", nullable = false)
    open var comfortClass: Int = 0

    @Column(name = "child_safety_seat")
    open var childSafetySeat: Int = 0

}