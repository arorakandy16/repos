package com.tothenew.RESTful_A2.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
//    Ques 9 Dynamic Filtering
@JsonFilter("UserDetailsFilter")
public class UserDetails {

    private String username;

//    Ques 8 Static Filtering
//    @JsonIgnore
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }
}