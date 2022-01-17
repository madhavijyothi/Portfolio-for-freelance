package com.allcodesnick.portfolio.controller.admin;

import com.allcodesnick.portfolio.model.Message;
import com.allcodesnick.portfolio.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/message")
public class AdminMessageController {

    private MessageService messageService;

    public AdminMessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/view/{messageId}")
    public Message getMessage(@PathVariable long messageId){
        return messageService.getMessageById(messageId);
    }

}
