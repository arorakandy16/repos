package JAVA1;

public class Ques4 {
    public static void main(String[] args) {
        String str1 = "KandyArora@#12345_";
        String[] arr = str1.split("");
        int a=0,b=0,c=0,d =0;
        CalcNum(str1,str1.length()-1,a,b,c,d);
    }

    public static String CalcNum(String arr, int len, int i, int j, int k, int l){
        int asciiVal = arr.charAt(len);
        if(asciiVal>=65 && asciiVal<=90 && len>0){
            len -= 1;
            i += 1;
            return CalcNum(arr,len,i,j,k,l);
        }
        else if (asciiVal>=97 && asciiVal<=122 && len>0){
            len -= 1;
            j += 1;
            return CalcNum(arr,len,i,j,k,l);
        }
        else if(asciiVal>=48 && asciiVal<=57 && len>0){
            len -= 1;
            k += 1;
            return CalcNum(arr,len,i,j,k,l);
        }
        else if(asciiVal>=65 && asciiVal<=90 && len==0) {
            i += 1;
            System.out.println("Upper case: "+i);
            System.out.println("Lower case: "+j);
            System.out.println("Number: "+k);
            System.out.println("Special Char: "+l);
        }
        else if(asciiVal>=97 && asciiVal<=122 && len==0){
            j += 1;
            System.out.println("Upper case: "+i);
            System.out.println("Lower case: "+j);
            System.out.println("Number: "+k);
            System.out.println("Special Char: "+l);
        }
        else if(asciiVal>=48 && asciiVal<=57 && len==0) {
            k += 1;
            System.out.println("Upper case: "+i);
            System.out.println("Lower case: "+j);
            System.out.println("Number: "+k);
            System.out.println("Special Char: "+l);

        }
        else {
            if(len==0){
                l += 1;
                System.out.println("Upper case: "+i);
                System.out.println("Lower case: "+j);
                System.out.println("Number: "+k);
                System.out.println("Special Char: "+l);
            }
            len -= 1;
            l += 1;
            return CalcNum(arr,len,i,j,k,l);
        }

        int z=i+j+k+l;
        System.out.println(i +"       "+z);
        System.out.println("% of upper case: "+(i*100.0)/z);
        int perlow;
        System.out.println("% of lower case: "+(j*100.0)/z);
        float perNum;
        System.out.println("% of Number: "+(k*100.0)/z);
        float perChr;
        System.out.println("% of Special char: "+(l*100.0)/z);

        return arr;
    }
}
