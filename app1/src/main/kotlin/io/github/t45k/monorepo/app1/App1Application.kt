package io.github.t45k.monorepo.app1

import io.github.t45k.monorepo.common.HELLO
import io.github.t45k.monorepo.sub1.PROJECT
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
class App1Controller {
    @GetMapping("/app1")
    fun hello(): String = "$HELLO, $PROJECT!"
}
