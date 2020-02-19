package JAVA1;

////Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively.

import java.util.Scanner;

public class Ques7 {
    static String firstname;
    static String lastname;
    static int age;

    static{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Firstname: ");
        firstname=sc.nextLine();
        System.out.print("Enter the Lastname: ");
        lastname=sc.nextLine();
        System.out.print("Enter the age: ");
        age=sc.nextInt();
    }
    static void getdetails(){
        System.out.println("First Name is: "+firstname);
        System.out.println("Lastname is: "+lastname);
        System.out.println("Age is: "+age);
    }
    public static void main(String[] args) {

        getdetails();
    }
}