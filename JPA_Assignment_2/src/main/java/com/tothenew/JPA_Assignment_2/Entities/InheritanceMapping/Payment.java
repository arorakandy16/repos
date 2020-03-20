package com.tothenew.JPA_Assignment_2.Entities.InheritanceMapping;

import javax.persistence.*;

//Inheritance Mapping:
//    Implement and demonstrate Single Table strategy.
//    Implement and demonstrate Joined strategy.
//    Implement and demonstrate Table Per Class strategy.

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "pmode",discriminatorType = DiscriminatorType.STRING)

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return amount;
    }

    public void setamount(double amount) {
        this.amount = amount;
    }
}