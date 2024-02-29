package com.thomaslhostis.quarkusgradlekotlinhexagone.application

import com.thomaslhostis.quarkusgradlekotlinhexagone.domain.ExamplePort
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ExampleUseCase(
    val examplePort: ExamplePort
) {
            fun findExample(id: String) = examplePort.findExample(id)
//    fun findExample(id: String) = "OK"
}
