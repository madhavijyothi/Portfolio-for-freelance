package com.allcodesnick.portfolio.service;

import com.allcodesnick.portfolio.model.Message;

import java.util.List;

public interface MessageService {

    Message saveMessage(Message message);

    List<Message> listMessages();

    Message getMessageById(long id);

    void deleteMessage(long id);

    Message updateMessage(Message message, long id);
}
