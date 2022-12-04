package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import com.example.todo.todoRouting
import com.example.users.userRouting

fun Application.configureRouting() {
    routing{
        get("/"){
            call.respondText("Hello world! This is main page!")
        }
    }
    todoRouting()
    userRouting()
}
