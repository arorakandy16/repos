package JAVA8;

//Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer
//(2) Supplier
//(3) Predicate
//(4) Function

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q5 {
    public static void main(String[] args) {

        System.out.println(" ---- Consumer ----");
        Consumer<Integer> con = a->System.out.println(a);
        con.accept(5);

        System.out.println("---- Supplier ----");
        Supplier supp = ()->{
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(supp.get());

        System.out.println("---- Predicate ----");
        Predicate<Integer> pred = a->a>0;
        System.out.println(pred.test(7));
        System.out.println(pred.test(-4));

        System.out.println("---- Function ----");
        Function<String, Integer> func = (a)->a.length();
        int value = func.apply("Kandy Arora");
        System.out.println(value);
    }
}
