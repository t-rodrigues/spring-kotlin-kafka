package dev.trodrigues.paymentsvc.resources.requests

import dev.trodrigues.paymentsvc.domain.Payment
import java.util.*

data class PaymentRequest(
    val userId: UUID,
    val productId: UUID,
    val cardNumber: String
)

fun PaymentRequest.toModel() = Payment(
    id = UUID.randomUUID(),
    userId = this.userId,
    productId = this.productId,
    cardNumber = this.cardNumber
)
