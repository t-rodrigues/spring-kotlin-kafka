package dev.trodrigues.paymentsvc.services

import dev.trodrigues.paymentsvc.domain.Payment

interface PaymentService {

    fun sendPayment(payment: Payment)

}
