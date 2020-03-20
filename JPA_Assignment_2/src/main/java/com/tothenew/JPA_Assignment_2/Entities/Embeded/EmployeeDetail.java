package com.tothenew.JPA_Assignment_2.Entities.Embeded;

import javax.persistence.*;


//Component Mapping:

//      Implement and demonstrate Embedded mapping using employee table having following fields: id, firstName,
//      lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
@Entity
public class EmployeeDetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String firstName;
    public String lastName;
    public int age;

    @Embedded
    public Salary salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}