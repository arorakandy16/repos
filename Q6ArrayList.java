package JAVA1;

//  There is an array with every element repeated twice except one. Find that element.

import java.util.ArrayList;
import java.util.List;

public class Q6ArrayList {
        public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        int sum = 0, sum2 = 0;
        int a[] = new int[]{1, 2, 3, 4, 1, 2, 3, 5, 4};
        for (int i = 0; i < a.length; i++) {
            if (l.contains(a[i])) {
                sum2 = sum2 + a[i];
            }
            else {
                l.add(a[i]);
                sum = sum + a[i];
            }
        }
        System.out.println(sum - sum2);
    }
}
