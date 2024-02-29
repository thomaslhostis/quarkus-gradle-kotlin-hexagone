package com.thomaslhostis.quarkusgradlekotlinhexagone.infrastructure

import com.thomaslhostis.quarkusgradlekotlinhexagone.domain.Example
import com.thomaslhostis.quarkusgradlekotlinhexagone.domain.ExamplePort

class ExampleAdapter : ExamplePort {
    override fun findExample(id: String) = Example("Bonjour")
}
