package com.thomaslhostis.quarkusgradlekotlinhexagone.presentation

import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/")
class ExampleController(
    private val exampleUseCase: InnerExampleUseCase,
) {
    @GET
    fun hello() = exampleUseCase.findExample("id")
}

@ApplicationScoped
class InnerExampleUseCase {
    fun findExample(id: String) = "Azerty"
}
