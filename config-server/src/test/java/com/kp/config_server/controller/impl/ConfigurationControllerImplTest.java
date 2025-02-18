package com.kp.config_server.controller.impl;

import com.kp.config_server.controller.ConfigurationController;
import com.kp.config_server.service.ConfigurationService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ConfigurationController.class)
class ConfigurationControllerImplTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ConfigurationService configurationService;

    @InjectMocks
    private ConfigurationController configurationController;

    @Test
    @DisplayName("To test greetings message is returned")
    @Tag("ConfigurationControllerSuccess")
    void getGreetings() throws Exception {
        mockMvc.perform(get("config/v1/greetings"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }
}
