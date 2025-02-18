package com.kp.config_server.controller.impl;

import com.kp.config_server.controller.ConfigurationController;
import com.kp.config_server.service.ConfigurationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 * This controller is used for configurations
 *
 * @author Krishna Prasad A
 * @since 14-02-2024
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class ConfigurationControllerImpl implements ConfigurationController {

    private final ConfigurationService configurationService;

    /**
     * This method is used for getting greetings
     *
     * @return String greetings
     */
    @Override
    public ResponseEntity<String> getGreetings() {
        log.info("[+] Method Invoked : getGreetings() : ");
        var greetingsMessage = configurationService.getGreetingsMessage();
        log.info("[+] Method Completed : getGreetings() : message -> {}.", greetingsMessage);
        return ResponseEntity.ok(greetingsMessage);
    }
}
