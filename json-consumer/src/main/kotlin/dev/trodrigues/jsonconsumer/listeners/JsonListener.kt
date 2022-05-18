package dev.trodrigues.jsonconsumer.listeners

import dev.trodrigues.jsonconsumer.domain.Payment
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class JsonListener(
    @Value("\${app.topics.payment-topic}")
    private val topic: String
) {

    @KafkaListener(topics = ["payment"], groupId = "payment")
    fun antiFraud(@Payload payment: Payment) {
        println("Payment: $payment")
        Thread.sleep(2000)
        println("Validando fraude...")
        Thread.sleep(2000)
        println("Compra aprovada")
        Thread.sleep(2000)
    }

    @KafkaListener(topics = ["payment"], groupId = "pdf-generator")
    fun pdfGenerator() {
        println("Gerando pdf...")
        Thread.sleep(2000)
    }

    @KafkaListener(topics = ["payment"], groupId = "email")
    fun sendMail() {
        println("Enviando email de confirmacao...")
        Thread.sleep(2000)
    }

}
