package dev.trodrigues.strconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StrConsumerApplication

fun main(args: Array<String>) {
    runApplication<StrConsumerApplication>(*args)
}
