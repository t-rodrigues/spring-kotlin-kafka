package dev.trodrigues.paymentsvc.services.impl

import dev.trodrigues.paymentsvc.domain.Payment
import dev.trodrigues.paymentsvc.services.PaymentService
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl(
    private val kafkaTemplate: KafkaTemplate<String, java.io.Serializable>,
    @Value("\${app.topics.payment-topic}") private val topic: String
) : PaymentService {
    override fun sendPayment(payment: Payment) {
        println("Recebi o pagamento $payment")
        Thread.sleep(1000)
        println("Enviado pagamento...")
        kafkaTemplate.send(topic, payment)
    }
}
