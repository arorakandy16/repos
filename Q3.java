package Collections;

//Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Q3 q3=new Q3();
        q3.Occur();

    }

    void Occur(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Character> ch =new TreeSet<>();
        for(int i=0;i<str.length();i++){
            ch.add(str.charAt(i));
        }
        String str1=ch.toString();
        for(int i=0;i<str1.length();i++){
            int count =0;
            for (int j=0;j<str.length();j++){
                if(str1.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(str1.charAt(i)+ " : "+count+" times.");
            }
        }
    }
}