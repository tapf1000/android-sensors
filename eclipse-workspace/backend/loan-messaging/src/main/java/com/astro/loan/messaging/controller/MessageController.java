package com.astro.loan.messaging.controller;

import com.astro.loan.messaging.dto.Message;
import com.astro.loan.messaging.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @PostMapping("/send/message")
    public String sendMessage(@RequestBody Message message){

        logger.info("message body {}",message);
        return messageService.sendMessage(message.getMessage(),message.getPhonenumber());
    }
}
