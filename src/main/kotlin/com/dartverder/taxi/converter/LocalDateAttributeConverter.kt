package com.dartverder.taxi.converter

import java.sql.Date
import java.time.LocalDate
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class LocalDateAttributeConverter : AttributeConverter<LocalDate, Date> {

    override fun convertToDatabaseColumn(localDate: LocalDate?): Date? {
        return if (localDate != null)
            Date.valueOf(localDate)
        else
            null
    }

    override fun convertToEntityAttribute(sqlDate: Date?): LocalDate? = sqlDate?.toLocalDate()

}