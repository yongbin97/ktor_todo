package com.example.users

import io.ktor.util.*
import org.ktorm.entity.Entity
import org.ktorm.schema.*
import java.time.LocalDate

//object User : Table<Nothing>("t_user"){
//    val id = int("id").primaryKey()
//    val name = varchar("name")
//    val createdAt = date("created_at")
//    val updatedAt = date("updated_at")
//}

interface User : Entity<User> {
    val id: Int
    var name: String
    var createdAt: LocalDate
    var updatedAt: LocalDate
}