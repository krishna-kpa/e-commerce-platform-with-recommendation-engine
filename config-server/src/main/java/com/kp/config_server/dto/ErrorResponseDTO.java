package com.kp.config_server.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO
 * This DTO is used for sending response to user in case of any exceptions
 * @author Krishna Prasad A
 * @since 14-02-2025
 */
@Setter
public class ErrorResponseDTO {

    @JsonProperty("code")
    private String errorCode;

    @JsonProperty("message")
    private String errorMessage;

    @JsonProperty("time-stamp")
    private LocalDateTime timeStamp = LocalDateTime.now();
}
