package JAVA8;

//Create a functional interface whose method takes 2 integers and return one integer.

interface secondinterface{
    int sum(int n1,int n2);

}
public class Q2 {
    public static void main(String[] args) {
        secondinterface m1=(int n1, int n2)-> {
            n1=n1+n2;
            return n1;
        };
        System.out.println(m1.sum(4,5));
    }
}