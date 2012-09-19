package br.com.pordotom.model;


public class Message {

    private boolean success = true;

    private String message = "Hello";

    public Message() {
    }

    public Message(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

}
