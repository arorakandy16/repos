package com.tothenew.JPA_Assignment_2.Entities.InheritanceMapping;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


//@DiscriminatorValue("ch")
@Entity
//@Table(name = "check")
@PrimaryKeyJoinColumn(name = "id")
public class CheckPay extends Payment
{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}