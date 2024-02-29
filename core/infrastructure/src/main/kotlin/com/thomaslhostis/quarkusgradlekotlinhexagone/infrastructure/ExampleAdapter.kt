package com.thomaslhostis.quarkusgradlekotlinhexagone.infrastructure

import com.thomaslhostis.quarkusgradlekotlinhexagone.domain.Example
import com.thomaslhostis.quarkusgradlekotlinhexagone.domain.ExamplePort
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ExampleAdapter : ExamplePort {
    override fun findExample(id: String) = Example("Bonjour de puis l'infrastructure")
}
