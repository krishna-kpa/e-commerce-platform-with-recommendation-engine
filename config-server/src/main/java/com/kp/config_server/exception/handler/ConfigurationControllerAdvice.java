package com.kp.config_server.exception.handler;

import com.kp.config_server.controller.ConfigurationController;
import com.kp.config_server.dto.ErrorResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controller Advice
 * This controller advice is responsible for handling all the exceptions generated in configuration server.
 * @author Krishna Prasad A
 * @since 14-02-204
 */
@Slf4j
@ControllerAdvice(assignableTypes = ConfigurationController.class)
public class ConfigurationControllerAdvice {

    /**
     * This method is used to handle all the general exceptions in the application
     * @param e Exception to handle
     * @return Response Entity of Error Response DTO.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDTO> handleGeneralException(Exception e){
        log.error("[-] Method Exception : General Exception Handler : message -> {}.", e.getMessage());
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setErrorCode("UNKNOWN_ERROR");
        errorResponseDTO.setErrorMessage("something unexpected happened !");
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
