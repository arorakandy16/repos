package JAVA2;

//WAP to read words from the keyboard until the word done is entered.
// For each word except done, report whether its first character is equal to its last character.
// For the required loop, use a

//a)while statement


import java.util.Scanner;

public class Q8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("done"))
            {
                System.out.println("Thank You");
                break;
            }
            else
            {
                int length = input.length();
                if(input.charAt(0)==input.charAt(length-1))
                {
                    System.out.println("First and Last character of "+input+" are same.");
                }
                else
                {
                    System.out.println("First and Last character of "+input+" are not same.");
                }
            }
        }
    }
}
