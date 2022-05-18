package dev.trodrigues.jsonconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JsonConsumerApplication

fun main(args: Array<String>) {
    runApplication<JsonConsumerApplication>(*args)
}
