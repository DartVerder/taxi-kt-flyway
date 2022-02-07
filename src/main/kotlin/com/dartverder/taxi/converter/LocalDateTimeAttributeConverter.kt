package com.dartverder.taxi.converter

import java.sql.Timestamp
import java.time.LocalDateTime
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class LocalDateTimeAttributeConverter : AttributeConverter<LocalDateTime, Timestamp> {
    override fun convertToDatabaseColumn(localDateTime: LocalDateTime?): Timestamp? {
        return if (localDateTime != null)
            Timestamp.valueOf(localDateTime)
        else
            null
    }

    override fun convertToEntityAttribute(sqlTimestamp: Timestamp?): LocalDateTime? = sqlTimestamp?.toLocalDateTime()
}