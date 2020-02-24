package JAVA8;

//Override the default method of the interface.

interface Test{

    default public void introduce(){
        System.out.println("i am the test interface..... ");
    }

    public int square(int a);
}

public class Q7 implements Test{
    // implement abstract method of interface
    public int square(int a){
        return a*a;
    }

    // override default method
    public void introduce(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Q7 q = new Q7();
        q.introduce();
        System.out.println(q.square(4));

    }
}