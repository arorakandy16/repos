package JAVA8;

//Using (instance) Method reference create and apply add and subtract method and
// using (Static) Method reference create and apply multiplication method for the functional interface created.


interface arithmetic_operation{
    int operation(int n1,int n2);
}

class Ques3 {

    static int add(int n1,int n2)
    {
        int sum=n1+n2;
        return sum;
    }
    static int subtract(int n1,int n2){
        int diff=n1-n2;
        return diff;
    }

    int multiplication(int n1,int n2){
        int mul=n1*n2;
        return mul;

    }

    public static void main(String[] args) {

        arithmetic_operation a1=Ques3::add;
        System.out.println((a1.operation(1,2)));

        arithmetic_operation s1=Ques3::subtract;
        System.out.println((s1.operation(3,2)));

        arithmetic_operation a3=new Ques3()::multiplication;
        System.out.println(a3.operation(3,3));

    }
}
