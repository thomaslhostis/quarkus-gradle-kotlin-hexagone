package com.thomaslhostis.quarkusgradlekotlinhexagone.application

import com.thomaslhostis.quarkusgradlekotlinhexagone.domain.ExamplePort

class ExampleUseCase(
    private val examplePort: ExamplePort
) {
        fun findExample(id: String) = examplePort.findExample(id)
//    fun findExample(id: String) = ""
}
