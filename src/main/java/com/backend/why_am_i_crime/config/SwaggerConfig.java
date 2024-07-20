package com.backend.why_am_i_crime.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {
    // http://localhost:8080/swagger-ui/index.html 로 접속

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Why Am i Crime Swagger")
                        .version("1.0")
                        .description("Why Am i Crime Swagger 입니다."));
    }
}