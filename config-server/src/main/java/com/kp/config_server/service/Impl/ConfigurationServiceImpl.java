package com.kp.config_server.service.Impl;

import com.kp.config_server.service.ConfigurationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static com.kp.config_server.constant.ConfigurationPropertyConstant.E_COM_CONFIGURATION_GREETINGS_MESSAGE;

/**
 * Service
 * This service is used for providing functionalities related to configuration
 *
 * @author Krishna Prasad A
 * @since 12-04-2024
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ConfigurationServiceImpl implements ConfigurationService {

    @Value(E_COM_CONFIGURATION_GREETINGS_MESSAGE)
    private String GREETINGS_MESSAGE;

    /**
     * This method is used for getting greetings message.
     * @return String - greetings message
     */
    @Override
    public String getGreetingsMessage() {
        log.info("[+] Method Invoked : getGreetingsMessage() : ");
        log.info("[+] Method Completed : getGreetingsMessage() : message -> {}.", GREETINGS_MESSAGE);
        return GREETINGS_MESSAGE;
    }
}
