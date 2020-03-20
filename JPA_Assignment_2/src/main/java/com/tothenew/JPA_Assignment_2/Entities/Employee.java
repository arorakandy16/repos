package com.tothenew.JPA_Assignment_2.Entities;

/*Create an Employee entity having following fields: id, firstName, lastName, salary, age which maps to the table columns given in above.*/

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @Column(name = "empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "empfirstname")
    private String firstname;
    @Column(name = "emplastname")
    private String lastname;
    @Column(name = "empsalary")
    private int salary;
    @Column(name = "empage")
    private  int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}