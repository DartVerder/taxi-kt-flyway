package com.dartverder.taxi.repository

import com.dartverder.taxi.model.Driver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface DriverRepository : JpaRepository<Driver, Long> {

    @Query("select d from Driver d where d.trips is empty")
    fun fakeDrivers(): Set<Driver>

    @Query("select d from Driver d left join d.car car where d.certificationLevel = 0 and car.comfortClass >= 0")
    fun economyDrivers(certificationLevel: Int, comfortClass: Int): Set<Driver>

    @Query("select d from Driver d left join d.car car where d.certificationLevel = 1 and car.comfortClass >= 1")
    fun comfortDrivers(): Set<Driver>

    @Query("select d from Driver d left join d.car car where d.certificationLevel = 2 and car.comfortClass >= 2")
    fun comfortPlusDrivers(): Set<Driver>

    @Query(
        "select d from Driver d left join d.trips trips where trips.tripRequest.datetimeOfCreation >= current_date " +
                "and trips.tripRequest.price.fullPrice > ?1"
    )
    fun moreThanPriceForToday(price: Double): List<Driver>

    @Query(
        "select d from Driver d left join d.trips trips group by d " +
                "order by sum(trips.tripRequest.price.fullPrice) DESC "
    )
    fun driversOrderedByTotalIncome(): List<Driver>

}