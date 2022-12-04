package com.example.dao

import io.ktor.server.config.*
import org.ktorm.database.Database
import com.zaxxer.hikari.*
import java.io.*

object DatabaseFactory {
    fun init(config: ApplicationConfig) {
        val driverClassName = config.property("storage.driverClassName").getString()
        val jdbcURL = config.property("storage.jdbcURL").getString()
        val username = config.property("storage.userName").getString()
        val password = config.property("storage.password").getString()
        println(jdbcURL)
        val datasource: HikariDataSource = dataSource(url = jdbcURL, driver = driverClassName, user = username, pw = password)
        val database = Database.connect(datasource)

    }

    private fun dataSource(
        url: String,
        driver: String,
        user: String,
        pw: String
    ) = HikariDataSource(HikariConfig().apply {
        driverClassName = driver
        jdbcUrl = url
        maximumPoolSize = 3
        isAutoCommit = false
        transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        username = user
        password = pw
        validate()
    })

}

