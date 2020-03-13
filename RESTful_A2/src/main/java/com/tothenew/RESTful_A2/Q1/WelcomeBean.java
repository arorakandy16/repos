package com.tothenew.RESTful_A2.Q1;

public class WelcomeBean {
    private String message;

    @Override
    public String toString() {
        return "WelcomeBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    WelcomeBean(String message){
        this.message = message;
    }

}