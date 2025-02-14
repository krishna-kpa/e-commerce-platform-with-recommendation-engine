package com.kp.user_service.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * Controller
 * This controller will be the providing REST end points for all user related operations.
 * @author Krishna Prasad A
 * @since 14-02-2024
 */
@OpenAPIDefinition(
        info = @Info(
                title = "User Controller",
                version = "1.0.0",
                summary = "all user related operations are allowed through this controller")
)
public interface UserController {
}
