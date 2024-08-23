package com.sirikonda.spring_boot_22.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig
{
    public OpenAPI customOpenApi()
    {
        return new OpenAPI()
                .info(new Info().title("spring boot Application for DAY-23")
                        .version("2.0.0")
                        .description("API documentation"));

    }
}
