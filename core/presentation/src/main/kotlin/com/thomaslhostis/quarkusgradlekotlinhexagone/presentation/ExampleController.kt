package com.thomaslhostis.quarkusgradlekotlinhexagone.presentation

import com.thomaslhostis.quarkusgradlekotlinhexagone.application.ExampleUseCase
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/")
class ExampleController(
    private val exampleUseCase: ExampleUseCase,
) {
    @GET
    fun hello() = exampleUseCase.findExample("id")
}
