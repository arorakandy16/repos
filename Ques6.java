package JAVA1;

//  There is an array with every element repeated twice except one. Find that element.

public class Ques6 {
    public static void main(String args[]) {
        int a[] = {2,0,2,3,4,4,3};
        int i, j,c=0,k=0;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = 0;
                    a[j] = 0;
                    break;
                }
            }
        }
        for (i = 0; i < a.length; i++)
        {
            if (a[i] != 0)
            {
                c=c+1;
                k=a[i];
            }
        }
        if(c>0)
        {
            System.out.println(k);
        }
        else
        {
            System.out.println(c);
        }
    }
}
