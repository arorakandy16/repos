package JAVA2;

//  WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

public class Q3 {
    public static void main(String[] args) {
//Test test = new Test();

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e)
        {
            System.out.println("Class not found");
            e.printStackTrace();
        }
        Trying t=new Trying();
        t.s="this is just for the practice";
    }
}
class Trying
{
    String s;
}