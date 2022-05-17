package dev.trodrigues.paymentsvc.domain

import java.util.*

data class Payment(
    val id: UUID,
    val userId: UUID,
    val productId: UUID,
    val cardNumber: String
)
