package dev.trodrigues.strproducer.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class StringProducerService(
    private val kafkaTemplate: KafkaTemplate<String, Any>,
    @Value("\${kafka.topics.str-topic}") private val topic: String
) {

    fun sendMessage(message: String) {
        kafkaTemplate.send(topic, message)
    }

}
