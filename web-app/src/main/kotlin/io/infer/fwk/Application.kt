package io.infer.fwk

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val embeddedServer = embeddedServer(Netty, port = 8086) {
        routing {
            get("/") {
                call.respondText("<h1>Hello,World!</h1>", ContentType.Text.Html)
            }
        }
    }
    embeddedServer.start(true)
}