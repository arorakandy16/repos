package JAVA1;

//Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,
// print details of every banks.

import java.util.Scanner;

public class Ques11 {
    Scanner sc = new Scanner(System.in);
    void getDetails()
    {
        System.out.print("Enter Rate of interest: ");
        double rateofinterest=sc.nextDouble();
        System.out.print("Enter Customer Name: ");
        String customer_name=sc.next();
        System.out.print("Enter Ifsc: ");
        String ifsc=sc.next();
        System.out.println(rateofinterest);
        System.out.print(customer_name+'\n');
        System.out.print(ifsc+'\n');
    }
    class ICICI
    {
        void getDetails()
        {
            System.out.print("Enter Rate of interest ICICI: ");
            double rateofinterest=sc.nextDouble();
            System.out.print("customer_name ICICI: ");
            String customer_name=sc.next();
            System.out.print("Enter ifsc ICICI: ");
            String ifsc=sc.next();
            System.out.println(rateofinterest);
            System.out.println(customer_name);
            System.out.print(ifsc+'\n');
        }

    }
    class SBI
    {
        void getDetails()
        {
            System.out.print("Enter Rate of interest SBI: ");
            double rateofinterest=sc.nextDouble();
            System.out.print("customer_name SBI: ");
            String customer_name=sc.next();
            System.out.print("Enter ifsc SBI: ");
            String ifsc=sc.next();
            System.out.println(rateofinterest);
            System.out.print(customer_name+'\n');
            System.out.print(ifsc+'\n');
        }

    }
    class BOI
    {
        void getDetails()
        {
            System.out.print("Enter Rate of interest BOI: ");
            double rateofinterest=sc.nextDouble();
            System.out.print("customer_name BOI: ");
            String customer_name=sc.next();
            System.out.print("Enter ifsc BOI: ");
            String ifsc=sc.next();
            System.out.println(rateofinterest);
            System.out.print(customer_name+'\n');
            System.out.print(ifsc+'\n');
        }

    }
    public static void main(String args[])
    {
        Ques11 b=new Ques11();
        Ques11.ICICI i = b.new ICICI();
        Ques11.SBI s = b.new SBI();
        Ques11.BOI bo = b.new BOI();
        b.getDetails();
        i.getDetails();
        s.getDetails();
        bo.getDetails();
    }
}
