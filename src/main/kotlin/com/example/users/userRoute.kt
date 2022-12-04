package com.example.users


import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.userRouting(){
    userListRouting()
}

fun Application.userListRouting(){
    routing{
        get("/user"){
            call.respondText("This is User List page")
        }
    }
}