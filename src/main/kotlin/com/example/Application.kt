package com.example

import io.ktor.server.application.*
import io.ktor.server.netty.*
import com.example.plugins.*
import com.example.dao.DatabaseFactory


fun main(args: Array<String>): Unit = EngineMain.main(args)


fun Application.module() {
    val database = DatabaseFactory.init(environment.config)
    configureSerialization()
    configureRouting()
}
