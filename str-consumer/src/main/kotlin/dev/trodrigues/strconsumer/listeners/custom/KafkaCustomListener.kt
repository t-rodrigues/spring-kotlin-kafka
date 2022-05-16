package dev.trodrigues.strconsumer.listeners.custom

import org.springframework.core.annotation.AliasFor
import org.springframework.kafka.annotation.KafkaListener

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@KafkaListener
annotation class KafkaCustomListener(
    @get:AliasFor(
        annotation = KafkaListener::class,
        attribute = "topics"
    ) val topics: Array<String> = ["\${kafka.topics.str-topic}"],

    @get:AliasFor(
        annotation = KafkaListener::class,
        attribute = "containerFactory"
    ) val containerFactory: String = "kafkaListenerContainerFactory",

    @get:AliasFor(
        annotation = KafkaListener::class,
        attribute = "groupId"
    ) val groupId: String = ""
)
