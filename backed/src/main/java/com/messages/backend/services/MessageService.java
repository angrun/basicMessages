package com.messages.backend.services;

import com.messages.backend.message.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message getHelloWorldMessage() {
        return new Message("Hello World Spring Boot and Vue.js!");
    }
}
