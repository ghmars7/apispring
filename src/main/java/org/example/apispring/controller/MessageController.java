package org.example.apispring.controller;

import org.example.apispring.model.Message;
import org.example.apispring.service.MessageService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("findByUsername/{username}")
    public List<Message> getMessagesByName(@PathVariable("username") String name) {
        return messageService.getMessageByName(name);
    }

}
