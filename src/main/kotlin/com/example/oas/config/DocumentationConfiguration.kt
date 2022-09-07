package com.example.oas.config

import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Profile("!prod")
@Configuration
class DocumentationConfiguration {
    @Bean
    fun adminApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("example")
            .addOpenApiCustomiser {
                it.info(
                    Info()
                        .title("Example Service API")
                        .description("Example Service API Doc")
                        .version("1.0")
                )
            }
            .pathsToMatch("/users/**") // based on api endpoint
            .build()
    }
}
