package com.dartverder.taxi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "car_model")
open class CarModel : Identifiable() {
    @Column(name = "model", nullable = false)
    open var model: String? = null

    @Column(name = "brand", nullable = false)
    open var brand: String? = null

    @OneToMany(mappedBy = "carModel", orphanRemoval = true)
    open var cars: MutableList<Car> = mutableListOf()
}