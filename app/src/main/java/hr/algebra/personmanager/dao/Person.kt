package hr.algebra.personmanager.dao

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.security.cert.CertPath
import java.time.LocalDate
import java.util.*

@Entity(tableName = "people")
data class Person(
    @PrimaryKey(autoGenerate = true) var _id: Long? = null,
    var title: String? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var picturePath: String? = null,
    var birthDate: LocalDate = LocalDate.now()) {
    override fun toString() = "$firstName $lastName"

}
