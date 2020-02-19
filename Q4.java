package JAVA2;

// WAP to create singleton class.

public class Q4 {
    private static Q4 single_instance = null;
    public  String s;
    private Q4()
    {
        System.out.println("This is the singleton class");
    }
    public static Q4 getInstance()
    {
        if (single_instance == null)
        {
            single_instance = new Q4();
        }

        return single_instance;
    }
    public static void main(String[] args) {
        Q4 x = Q4.getInstance();
        Q4 y = Q4.getInstance();
        Q4 z = Q4.getInstance();
    }
}
