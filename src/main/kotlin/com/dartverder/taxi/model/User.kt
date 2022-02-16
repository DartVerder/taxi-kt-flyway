package com.dartverder.taxi.model

import org.hibernate.validator.constraints.Range
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.JoinColumn
import javax.persistence.MappedSuperclass
import javax.persistence.OneToOne

@MappedSuperclass
abstract class User : Identifiable() {
    @Column(name = "first_name", nullable = false)
    open var firstName: String? = null

    @Column(name = "last_name", nullable = false)
    open var lastName: String? = null

    @Column(name = "date_of_birth", nullable = false)
    open var dateOfBirth: LocalDate? = null

    @Range(min = 2, max = 5)
    @Column(name = "rating", nullable = false)
    open var rating: Double = 5.0

    @OneToOne
    @JoinColumn(name = "card_id", nullable = false)
    open var card: Card? = null
}