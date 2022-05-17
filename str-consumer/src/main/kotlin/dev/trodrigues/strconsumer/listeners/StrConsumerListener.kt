package dev.trodrigues.strconsumer.listeners

import dev.trodrigues.strconsumer.listeners.custom.KafkaCustomListener
import org.springframework.stereotype.Component

@Component
class StrConsumerListener {

    @KafkaCustomListener(groupId = "group-1")
    fun create(message: String) {
        println("CREATE ::: Received message=[$message]")
        throw IllegalArgumentException("EXCEPTION...")
    }

    @KafkaCustomListener(groupId = "group-1")
    fun log(message: String) {
        println("LOG ::: Received message=[$message]")
    }

    @KafkaCustomListener(groupId = "group-2")
    fun history(message: String) {
        println("HISTORY ::: Received message=[$message]")
    }

}
