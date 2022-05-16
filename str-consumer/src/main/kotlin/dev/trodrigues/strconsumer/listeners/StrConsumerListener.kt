package dev.trodrigues.strconsumer.listeners

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class StrConsumerListener {

    @KafkaListener(topics = ["\${kafka.topics.str-topic}"], groupId = "group-0")
    fun create(message: String) {
        println("CREATE ::: Received message=[$message]")
    }

    @KafkaListener(topics = ["\${kafka.topics.str-topic}"], groupId = "group-1")
    fun log(message: String) {
        println("LOG ::: Received message=[$message]")
    }

    @KafkaListener(topics = ["\${kafka.topics.str-topic}"], groupId = "group-2")
    fun history(message: String) {
        println("HISTORY ::: Received message=[$message]")
    }

}
