package com.example.ChatSimple;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Maps to /app/sendMessage
    @SendTo("/topic/messages")     // Broadcast to subscribers of /topic/messages
    public ChatMessage broadcastMessage(ChatMessage message) {
        return message; // Broadcast the received message
    }
}

