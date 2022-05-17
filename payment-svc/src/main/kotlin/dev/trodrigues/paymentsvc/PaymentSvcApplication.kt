package dev.trodrigues.paymentsvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaymentSvcApplication

fun main(args: Array<String>) {
    runApplication<PaymentSvcApplication>(*args)
}
