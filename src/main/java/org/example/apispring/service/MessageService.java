package org.example.apispring.service;

import org.example.apispring.repository.MessageRepository;
import org.example.apispring.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public void addMessage(Message message) {
        messageRepository.save(message);
    }
}
