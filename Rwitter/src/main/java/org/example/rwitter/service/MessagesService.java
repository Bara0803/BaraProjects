package org.example.rwitter.service;

import org.example.rwitter.model.Account;
import org.example.rwitter.model.Messages;

import java.util.List;

public interface MessagesService {

    void createMessage(Messages messages);
    void deleteMessage(Messages messages);
    void updateMessage(Messages messages);
    List<Messages> getAllMessages();
}
