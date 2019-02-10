package com.messages.backed.controllers;

import com.messages.backed.services.MessageService;
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

//
//    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(path = "/hello")
    public String getMessage() {
        return messageService.getHelloWorldMessage().message;
    }

}
