package com.example.Cinema.Entities;

public class ObjectConstructor {

    private String status;
    private String message;

    public ObjectConstructor() {}

    public ObjectConstructor(String message)
    {
        this.message = message;
    }

    public ObjectConstructor(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "ObjectConstructor{" +
                "Status=" + status +
                ", message='" + message +
                '}';
    }
}
