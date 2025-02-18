package com.kp.config_server.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Controller
 * This controller is used for configurations
 * @author Krishna Prasad A
 * @since 14-02-2024
 */
@OpenAPIDefinition(
        info = @Info(
                title = "Greetings Controller",
                version = "1.0.0",
                summary = "This controller is used for getting configurations from config server."
        )
)
public interface ConfigurationController {

    /**
     * This method is used for getting greetings
     * @return String greetings
     */
    @ApiResponse(
            responseCode = "200",
            description = "Successfully returns Greetings message"
    )
    public ResponseEntity<String> getGreetings();
}
