package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    // OpenAPI 설정을 정의하는 Bean
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components()) // Swagger 구성 요소 추가
                .info(apiInfo()); // API 정보 추가
    }

    // API의 제목, 설명 및 버전 정보를 설정하는 메서드
    private Info apiInfo() {
        return new Info()
                .title("API 제목") // Swagger UI에서 표시되는 API의 제목
                .description("api 테스트용입니다") // API에 대한 설명
                .version("1.0.0"); // API의 버전
    }
}