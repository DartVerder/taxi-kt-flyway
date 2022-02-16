package com.dartverder.taxi.model

import org.hibernate.annotations.Columns
import org.hibernate.annotations.Type
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "car")
open class Car : Identifiable() {

    @Columns(
        columns = [Column(name = "license_plate"),
            Column(name = "region")]
    )
    @Type(type = "com.dartverder.taxi.converter.LicensePlateCustomType")
    open var licensePlate: String? = null

    @ManyToOne(optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    open var driver: Driver? = null

    @Column(name = "colour", nullable = false)
    open var colour: String? = null

    @ManyToOne(optional = false)
    @JoinColumn(name = "car_model_id", nullable = false)
    open var carModel: CarModel? = null

    @Column(name = "production_date")
    open var productionDate: LocalDate? = null

    @Column(name = "comfort_class", nullable = false)
    open var comfortClass: Int = 0

    @Column(name = "child_safety_seat")
    open var childSafetySeat: Int = 0

}