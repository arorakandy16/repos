package JAVA1;

// Write a program to find the number of occurrences of the duplicate words in a string and print them ?

public class Ques2 {

    public static void main(String[] args) {
        String str1 = "kandy twinkle twinkle little kandy star kandy";
        DuplicateStr(str1);
    }

    public static void DuplicateStr(String str){
        String [] arr = str.split(" ");
        int i=0;
        for (;i<arr.length;i++){
            int c=1;
            for (int j=0;j<arr.length;j++){
                if (arr[i].equalsIgnoreCase(arr[j]) && i != j){
                    c += 1;
                    arr[j]=" ";
                }
            }
            if (c!=1 && !arr[i].equalsIgnoreCase(" ")){
                System.out.println(arr[i]+" "+ c + " Times");
            }

        }
    }
}
