package com.example.todo

import org.ktorm.schema.*
import com.example.users.User
import org.ktorm.entity.Entity
import java.time.LocalDate

//object Todo : Table<Nothing>("t_todo"){
//    val id = int("id").primaryKey()
//    val userId = int("user_id")
//    val title = varchar("title")
//    val content = varchar("content")
//    val createdAt = date("created_at")
//    val updatedAt = date("updated_at")
//}

interface Todo: Entity<Todo> {
    val id : Int
    val user: User
    var title: String
    var content: String
    var createdAt: LocalDate
    var updatedAt: LocalDate
}