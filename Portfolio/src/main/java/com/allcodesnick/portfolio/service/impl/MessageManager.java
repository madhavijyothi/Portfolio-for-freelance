package com.allcodesnick.portfolio.service.impl;

import com.allcodesnick.portfolio.exception.ResourceNotFoundException;
import com.allcodesnick.portfolio.model.Message;
import com.allcodesnick.portfolio.repository.MessageRepository;
import com.allcodesnick.portfolio.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageManager implements MessageService {

    private MessageRepository messageRepository;

    public MessageManager(MessageRepository messageRepository) {
        super();
        this.messageRepository = messageRepository;
    }

    @Override
    public Message saveMessage(Message message){
        return messageRepository.save(message);
    }

    @Override
    public List<Message> listMessages(){
        return messageRepository.findAll();
    }

    @Override
    public Message getMessageById(long id){
        return messageRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Message","ID", id));
    }

    @Override
    public void deleteMessage(long id){
        Message message = messageRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Message","ID", id));
        messageRepository.delete(message);
    }

    @Override
    public Message updateMessage(Message message, long id){
        Message existingMessage = messageRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Message","ID", id));
        existingMessage.setMessage(message.getMessage());
        return messageRepository.save(existingMessage);
    }

}
