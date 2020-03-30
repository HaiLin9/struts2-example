package com.example.resourcefile.action;

import com.example.resourcefile.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHelloCount() {
        return helloCount;
    }

    private static int helloCount = 0;

    private MessageStore messageStore;

    public String execute() {
        helloCount++;
        messageStore = new MessageStore() ;

        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
