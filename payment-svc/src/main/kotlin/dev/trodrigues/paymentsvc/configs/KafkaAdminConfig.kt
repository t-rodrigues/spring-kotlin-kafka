package dev.trodrigues.paymentsvc.configs

import org.apache.kafka.clients.admin.AdminClientConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaAdminConfig(
    private val kafkaProperties: KafkaProperties,
    @Value("\${app.topics.payment-topic}")
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
    fun newTopics(): KafkaAdmin.NewTopics =
        KafkaAdmin.NewTopics(
            TopicBuilder.name(topic).partitions(1).build()
        )

}
