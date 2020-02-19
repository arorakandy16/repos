package JAVA2;

//WAP to show object cloning in java using cloneable and copy constructor both.

public class Q5 {
    String fName;
    String lName;

    public Q5(String f, String l)
    {
        this.fName = f;
        this.lName = l;
    }

    public Q5(Q5 obj)
    {
        fName = obj.fName;
        lName = obj.lName;
    }

     public static void main(String[] args) throws CloneNotSupportedException {
         Q5 obj = new Q5("Kandy", "Arora");
         Q5 obj2 = new Q5(obj);
         System.out.println(obj2.fName);
         System.out.println(obj2.lName);

         tryingClone tc = new tryingClone();
         tc.name = "kandy";
         tryingClone tc1 = (tryingClone) tc.clone();
         System.out.println(tc1.name.toString());

     }

}

class tryingClone implements Cloneable {
    String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
