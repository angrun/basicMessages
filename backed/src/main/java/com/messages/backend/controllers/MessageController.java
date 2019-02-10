package com.messages.backend.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messages.backend.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    MessageService messageService;

    @CrossOrigin()
    @GetMapping(path = "/hello")
    public String getMessage() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(messageService.getHelloWorldMessage());
    }

}
