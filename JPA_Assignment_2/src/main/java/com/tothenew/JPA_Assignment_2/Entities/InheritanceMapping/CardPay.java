package com.tothenew.JPA_Assignment_2.Entities.InheritanceMapping;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


//@DiscriminatorValue("cc")
@Entity
//@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
public class CardPay extends Payment
{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber)
    {
        this.cardnumber = cardnumber;
    }
}