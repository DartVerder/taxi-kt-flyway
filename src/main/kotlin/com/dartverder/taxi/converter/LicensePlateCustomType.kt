package com.dartverder.taxi.converter

import org.hibernate.HibernateException
import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.usertype.UserType
import java.io.Serializable
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Types

class LicensePlateCustomType : UserType
{
    override fun equals(x: Any?, y: Any?): Boolean = x == y

    override fun hashCode(x: Any?): Int = x.hashCode()


    override fun sqlTypes(): IntArray {
        return intArrayOf(Types.VARCHAR, Types.INTEGER)
    }

    override fun returnedClass(): Class<*> {
        return String::class.java
    }

    override fun nullSafeGet(
        rs: ResultSet?,
        names: Array<out String>?,
        session: SharedSessionContractImplementor?,
        owner: Any?
    ): String {
        if (rs?.wasNull() != false)
            return ""
        val licensePlateNumber = rs.getString(names?.get(0))
        val licensePlateRegion = rs.getInt(names?.get(1))
        return licensePlateNumber + licensePlateRegion.toString()
    }

    override fun nullSafeSet(
        st: PreparedStatement?,
        value: Any?,
        index: Int,
        session: SharedSessionContractImplementor?
    ) {
        if (value == null) {
            st?.setString(index, "")
            st?.setInt(index + 1, 0)
        } else {
            var licensePlate: String = value as String
            val region: Int = licensePlate.substring(6).toInt()
            licensePlate = licensePlate.substring(0..5)

            st?.setString(index, licensePlate)
            st?.setInt(index + 1, region)
        }
    }

    override fun deepCopy(value: Any?): Any = value?:""

    override fun isMutable(): Boolean {
        return true
    }

    @Throws(HibernateException::class)
    override fun disassemble(value: Any?): Serializable {
        return value as Serializable
    }

    override fun assemble(cached: Serializable?, owner: Any?): Any{
        return cached?:""
    }

    override fun replace(original: Any?, target: Any?, owner: Any?): Any {
        return original?:""
    }
}
