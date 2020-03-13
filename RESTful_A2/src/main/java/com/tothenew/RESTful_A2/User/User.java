package com.tothenew.RESTful_A2.User;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.util.Date;

@JsonFilter("UserFilter")
public class User {
    private Integer id;
    private String name;
    private Date birthDate;

    public User (Integer id, String name, Date birthDate){
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
protected User(){

}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void add(User user) {
    }
}
