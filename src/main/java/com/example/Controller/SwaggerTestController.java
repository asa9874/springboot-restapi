package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "swageer 테스트용컨트롤러", description = "swagger테스트용입니다.") // Swagger에서 이 컨트롤러를 그룹화
public class SwaggerTestController {

    // GET 요청을 처리하는 API 엔드포인트
    @GetMapping("/hello")
    @Operation(summary = "반가움을보내요", description = "'Hello, World!'메시지를 반환") // API 설명 추가
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Request was successful")
    })
    public String sayHello() {
        return "Hello, World!"; // 간단한 문자열을 반환
    }

    @Operation(summary = "Get ID")
    @GetMapping("/{id}")
    public Long getId(
        @Parameter(description = "ID를받아온다", required = true) 
        @PathVariable Long id) {
            return id;
    }

    // POST 요청을 처리하는 API 엔드포인트
    @PostMapping("/message")
    @Operation(summary = "메시지를 받아요", description = "메시지를 받아서 반환해요") // API 설명 추가
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Request was successful"),
        @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public String echoMessage(@RequestBody String message) {
        return "Received message: " + message; // 입력받은 메시지를 반환
    }
}