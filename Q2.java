package JAVA2;

//  WAP to sorting string without using string Methods?

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        String given = "dcba";
        char c[] = given.toCharArray();
        Arrays.sort(c);
        String output = new String(c);
        System.out.println(output);
    }
}
