package com.cesarkoot.httpsconsumer;

import com.cesarkoot.httpsconsumer.services.MessageConnectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@RestController
public class MessageController {

    private MessageConnectorService messageConnectorService;

    @Autowired
    public MessageController(MessageConnectorService messageConnectorService) {
        this.messageConnectorService = messageConnectorService;
    }

    @GetMapping("/")
    public String getMessage() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        return messageConnectorService.getMessageFromProducer();
    }

}
