package com.example.plugins

import com.example.models.articles
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondRedirect("articles")
        }
        route("articles") {
            get {
                // Show a list of articles
                call.respond(FreeMarkerContent("index.ftl", mapOf("articles" to articles)))
            }
            get("new") {
                // Show a page with fields for creating a new article
            }
            post {
                // Save an article
            }
            get("{id}") {
                // Show an article with a specific id
            }
            get("{id}/edit") {
                // Show a page with fields for editing an article
            }
            post("{id}") {
                // Update or delete an article
            }
        }
    }
}
