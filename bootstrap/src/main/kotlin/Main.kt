package com.thomaslhostis.quarkusgradlekotlinhexagone

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
class Main

fun main(args: Array<String>) {
    println("Running application...")
    Quarkus.run(*args)
}
