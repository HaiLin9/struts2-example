package com.example.codingaction.action;

import com.example.codingaction.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    public int getHelloCount() {
        return helloCount;
    }

    private static int helloCount = 0;

    private MessageStore messageStore;

    public String execute() {
        helloCount++;
        messageStore = new MessageStore() ;

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
