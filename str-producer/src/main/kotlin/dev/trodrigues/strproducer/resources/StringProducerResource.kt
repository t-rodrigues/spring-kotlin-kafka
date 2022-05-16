package dev.trodrigues.strproducer.resources

import dev.trodrigues.strproducer.services.StringProducerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producer")
class StringProducerResource(
    private val stringProducerService: StringProducerService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun sendMessage(@RequestBody message: String) {
        stringProducerService.sendMessage(message)
    }

}
