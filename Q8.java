package JAVA8;

//Implement multiple inheritance with default method inside interface.

interface Test1
{
    // default method
    default void show()
    {
        System.out.println("Default Test1");
    }
}

interface Test2
{
    // Default method
    default void show()
    {
        System.out.println("Default Test2");
    }
}

// Implementation class code
class Q8 implements Test1, Test2
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of Test1 interface
        Test1.super.show();

        // use super keyword to call the show
        // method of Test2 interface
        Test2.super.show();

        System.out.println("show method of class");
    }

    public static void main(String args[])
    {
        Q8 q = new Q8();
        q.show();
    }
}
