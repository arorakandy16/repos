package Collections;

//Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        List<Float> arr = new ArrayList<Float>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            float f=sc.nextFloat();
            arr.add(f);
        }
        Iterator<Float> iterator=arr.iterator();
        float Arr=0;
        while (iterator.hasNext()){
            Arr=iterator.next()+Arr;
        }
        System.out.println("Addition = "+Arr);
    }
}