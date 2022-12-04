package com.example.database

import org.ktorm.database.Database

object Database {
    val database: Database = Database.connect(
        url = "jdbc:mysql://localhost:3306/ktorm",
        driver = "com.mysql.jdbc.Driver",
        user = "root",
        password = "asdf1234"
    )
}
