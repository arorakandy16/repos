package JAVA1;

public class Ques3 {
    public static String [] Occurance(String [] arr,int i,int count){
        String str = "h";
        int c;
        if (str.equalsIgnoreCase(arr[i]) && i>0){
            c=count+1;
            int j = i-1;
            return Occurance(arr, j, c);
        }
        else if(i>0) {
            int j = i-1;
            return Occurance(arr, j, count);
        }
        else if(str.equalsIgnoreCase(arr[0]) && i==0){
            c=count +=1;
            System.out.println(count);
        }
        else {
            System.out.println(count);

        }
        return arr;
    }


    public static void main(String[] args) {
        String str1 = "Kandy Arora";
        String[] arr = str1.split("");
        int a=0;
        Occurance(str1.split(""),arr.length-1,a);
    }
}
