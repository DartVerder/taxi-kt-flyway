package com.dartverder.taxi.model

import javax.persistence.*

@MappedSuperclass
abstract class Identifiable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
}