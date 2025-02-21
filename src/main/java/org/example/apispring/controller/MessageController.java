package org.example.apispring.controller;

import org.example.apispring.model.Message;
import org.example.apispring.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("getAllMessages")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping("setMessage")
    public void setMessage(@RequestBody Message message) {
        this.messageService.addMessage(message);
    }


}
