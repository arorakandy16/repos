package com.tothenew.RESTful_A2.Employee;

//Create an Employee Bean(id, name, age) and service to perform different operations related to employee.

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;

public class EmployeeBean {
    private Integer id;
    //------------------------------------------------------------------------------------------------------
    //Apply validation while create a new employee using POST http Request.
    @Size(min = 4)
    private String name;
    //----------------------------------------------------------------------------------------------------
    private int age;

    // Create default constructor to remove 500 Internal Server Error in Ques 5
    protected EmployeeBean(){ }
    //----------------------------------------------------------------------------------------------------

    EmployeeBean(Integer id, String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}