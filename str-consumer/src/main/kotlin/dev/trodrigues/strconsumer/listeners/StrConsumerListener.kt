package dev.trodrigues.strconsumer.listeners

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class StrConsumerListener {

    @KafkaListener(topics = ["\${kafka.topics.str-topic}"], groupId = "group-1")
    fun listener(message: String) {
        println("Received message=[$message]")
    }

}
