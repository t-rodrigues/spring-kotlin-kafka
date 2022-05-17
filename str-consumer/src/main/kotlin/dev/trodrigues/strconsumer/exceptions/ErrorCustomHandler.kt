package dev.trodrigues.strconsumer.exceptions

import org.springframework.kafka.listener.KafkaListenerErrorHandler
import org.springframework.kafka.listener.ListenerExecutionFailedException
import org.springframework.messaging.Message
import org.springframework.stereotype.Component

@Component
class ErrorCustomHandler : KafkaListenerErrorHandler {

    override fun handleError(message: Message<*>, exception: ListenerExecutionFailedException) {
        println("EXCEPTION_HANDLER ::: ${exception.message}")
        println("PAYLOAD ::: ${message.payload}")
        println("HEADERS ::: ${message.headers}")
        println("OFFSET ::: ${message.headers["kafka_offset"]}")
        println("TOPIC ::: ${message.headers["kafka_receivedTopic"]}")
    }

}
