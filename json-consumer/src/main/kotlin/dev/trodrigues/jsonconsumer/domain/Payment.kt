package dev.trodrigues.jsonconsumer.domain

import java.io.Serializable
import java.util.*

data class Payment(
    val id: UUID,
    val userId: UUID,
    val productId: UUID,
    val cardNumber: String
) : Serializable
