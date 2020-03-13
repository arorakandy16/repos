package com.tothenew.RESTful_A2.Versioning;

public class UserV1 {
    public UserV1(){

    }
    public UserV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}