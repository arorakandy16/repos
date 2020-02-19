package JAVA1;

//  Find common elements between two arrays.

import java.util.Arrays;
public class Ques5 {
    public static void main(String[] args) {
        int arr1 []={1,2,5,4,9};
        int arr2 [] ={2,5,3,0,1};
        Arrays.sort(arr1);
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j<arr2.length;j++) {
                if (arr1[i] == arr2[j] && i + 1 < arr1.length && arr1[i] != arr1[i + 1])
                    System.out.println(arr1[i]);

                else if (arr1[i] == arr2[j] && i == arr1.length - 1) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

// This ques can be done by Hashset