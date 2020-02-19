package JAVA2;

//WAP showing try, multi-catch and finally blocks.

public class Q6 {
    public static void main(String[] args)throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        int a[]={1,2,3,4};

        try
        {
            int A=0;
            int B=5;
            int C =B/A;
            for(int i=0; i<5;i++)
            {
                System.out.println(a[i]);
            }

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException aa)
        {
            System.out.println(aa);
        }
        finally{
            System.out.println("execution is over");
        }
    }
}
