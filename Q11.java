package JAVA8;

//Find average of the number inside integer list after doubling it.

import java.util.Arrays;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(
                list
                        .stream()
                        .mapToInt(e->e*2)
                        .average()
                        .getAsDouble()

        );
    }
}