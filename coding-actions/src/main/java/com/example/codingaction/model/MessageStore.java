package com.example.codingaction.model;

public class MessageStore {
    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return message + " (from toString)";
    }
}
