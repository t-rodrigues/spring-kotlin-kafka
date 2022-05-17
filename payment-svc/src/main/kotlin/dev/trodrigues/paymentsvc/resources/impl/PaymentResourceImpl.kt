package dev.trodrigues.paymentsvc.resources.impl

import dev.trodrigues.paymentsvc.resources.PaymentResource
import dev.trodrigues.paymentsvc.resources.requests.PaymentRequest
import dev.trodrigues.paymentsvc.resources.requests.toModel
import dev.trodrigues.paymentsvc.services.PaymentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentResourceImpl(
    private val paymentService: PaymentService
) : PaymentResource {
    @ResponseStatus(HttpStatus.CREATED)
    override fun payment(paymentRequest: PaymentRequest) {
        paymentService.sendPayment(paymentRequest.toModel())
    }
}
