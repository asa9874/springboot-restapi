package com.example.Model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Testter {
    @Schema(description = "Unique identifier of the user", example = "123")
    private Long id;

    @Schema(description = "Name of the user", example = "John Doe")
    private String name;
}