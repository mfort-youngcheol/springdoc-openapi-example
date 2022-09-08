package com.example.oas.ui.web.operation

import io.swagger.v3.oas.annotations.Hidden
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Hidden
@RestController
class HealthCheckController {

//    @Hidden
    @GetMapping("/health")
    fun healthCheck(): Map<String, String> = mapOf("status" to "healthy")
}
