package JAVA1;

// Write a program to replace a substring inside a string with other string ?

public class Ques1 {
    public static void main(String[] args) {
        String str1 = "Kandy is frontend developer.";

        System.out.println(str1);
        String str2 = replaced(str1, "frontend", "Java");
        System.out.println(str2);
    }

    public static String replaced(String str, String from, String to){
        String [] arr = str.split(from);
        StringBuilder result = new StringBuilder();

        int i=0;
        for (i=0; i < arr.length-1 ;i++){
            result.append(arr[i]).append(to);
        }

        result.append(arr[i]);

//        if(str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
//            result.append(to);


        return result.toString();
    }
}
