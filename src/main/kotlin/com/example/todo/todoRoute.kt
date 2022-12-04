package com.example.todo

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.todoRouting(){
    todoListRouting()
}

fun Application.todoListRouting(){
    routing{
        get("/todo"){
            call.respondText("This is Todo List page")
        }
    }
}