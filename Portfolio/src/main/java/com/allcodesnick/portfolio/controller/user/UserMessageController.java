package com.allcodesnick.portfolio.controller.user;

import com.allcodesnick.portfolio.model.Message;
import com.allcodesnick.portfolio.service.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/messages")
public class UserMessageController {

    private MessageService messageService;

    public UserMessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/create")
    public Message createMessage(Message message){
        return messageService.saveMessage(message);
    }

    @DeleteMapping("/delete/{messageId}")
    public void deleteMessage(@PathVariable long messageId){
        messageService.deleteMessage(messageId);
    }
}
