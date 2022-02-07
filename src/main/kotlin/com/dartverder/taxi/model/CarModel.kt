package com.dartverder.taxi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "car_model")
open class CarModel(
    @Column(name = "model", nullable = false)
    open var model: String,

    @Column(name = "brand", nullable = false)
    open var brand: String
) : Identifiable() {

    @OneToMany(mappedBy = "carModel", orphanRemoval = true)
    open var cars: MutableList<Car> = mutableListOf()
}