package io.github.t45k.monorepo.app2

import io.github.t45k.monorepo.common.HELLO
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class MonorepoApplication

fun main(args: Array<String>) {
    runApplication<MonorepoApplication>(*args)
}

@RestController
class App2Controller {
    @GetMapping("/app2")
    fun hello(): String = "$HELLO, App2!"
}
