package dev.trodrigues.paymentsvc.resources

import dev.trodrigues.paymentsvc.resources.requests.PaymentRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

interface PaymentResource {

    @PostMapping
    fun payment(@RequestBody paymentRequest: PaymentRequest)

}
