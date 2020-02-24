package JAVA8;

//Create and access default and static method of an interface.

interface TestInterface
{
    // abstract method
    default public int square(int a){
        return a*a;
    }

    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }
}

class Q6 implements TestInterface
{

    public static void main(String args[])
    {
        Q6 q = new Q6();

        int result = q.square(4);
        System.out.println(result);

        // Static method executed
        TestInterface.show();
    }
}
