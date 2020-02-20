package JAVA2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) throws CloneNotSupportedException {

    }
}

class Barista {
    static boolean ready=false;

    public static boolean prep(){

        System.out.println("Order in preparation");
        ready=true;
        done();
        return ready;
    }

    static void done(){
        Cashier.q.remove();
        Cust.ready();
    }

}

class Cashier {
    public static Queue<String> q = new LinkedList<>();
    static void add(String coffe){
        System.out.println("order Accepted");
        System.out.println("Order No "+q.size());
        q.add(coffe);
        Barista.prep();
    }
}

class Cust {
    String order="";
    Scanner sc=new Scanner(System.in);
    public Cust(){
        System.out.println("Enter a coffee");
        order=sc.nextLine();
        payment();

    }


    void payment(){

        Cashier.add(order);

    }
    static void ready(){
        System.out.println("Your Order is ready");
    }
}