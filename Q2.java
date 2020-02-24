package Collections;

//Write a method that takes a string and returns the number of unique characters in the string.

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Q2 q2=new Q2();
        q2.unique();
    }
    void unique(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> characters=new TreeSet<>();

        for (int i=0;i<s.length();i++){
            characters.add(s.charAt(i));
        }
        System.out.println("Unique characters in "+s+" are "+characters.toString());
    }
}
