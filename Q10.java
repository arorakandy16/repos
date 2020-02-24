package JAVA8;

//Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(
                list
                        .stream()
                        .filter(e->e>5)
                        .mapToInt(e->e)
                        .sum()
        );
    }
}