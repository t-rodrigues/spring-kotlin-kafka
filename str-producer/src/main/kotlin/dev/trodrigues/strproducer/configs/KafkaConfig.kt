package dev.trodrigues.strproducer.configs

import org.apache.kafka.clients.admin.AdminClientConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaConfig(
    private val kafkaProperties: KafkaProperties,
    @Value("\${kafka.topics.str-topic}")
    private val topic: String
) {

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val configs = HashMap<String, Any>().apply {
            put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.bootstrapServers)
        }
        return KafkaAdmin(configs)
    }

    @Bean
    fun kafkaTopics(): KafkaAdmin.NewTopics {
        return KafkaAdmin.NewTopics(
            TopicBuilder.name(topic).partitions(2).replicas(1).build()
        )
    }

}
