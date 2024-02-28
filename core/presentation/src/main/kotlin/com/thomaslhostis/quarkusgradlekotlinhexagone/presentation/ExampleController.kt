package com.thomaslhostis.quarkusgradlekotlinhexagone.presentation

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/home")
class ExampleController {
    @GET
    fun hello() = "Hello from RESTEasy Reactive"
}
