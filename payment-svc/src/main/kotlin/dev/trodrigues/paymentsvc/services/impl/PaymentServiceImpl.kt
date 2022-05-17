package dev.trodrigues.paymentsvc.services.impl

import dev.trodrigues.paymentsvc.domain.Payment
import dev.trodrigues.paymentsvc.services.PaymentService
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl : PaymentService {
    override fun sendPayment(payment: Payment) {
        println("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento $payment")
    }
}
