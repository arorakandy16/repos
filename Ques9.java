package JAVA1;

//  Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices).
enum houses
{
    house1,house2,house3,house4;
}
public class Ques9 {
    static houses house;

    Ques9(houses house)
    {
        this.house=house;
    }
    public void getprice()
    {
        switch (house)
        {
            case house1:
            {
                System.out.println("price is 1000");
            }
            break;
            case house2:
            {
                System.out.println("price is 2000");
            }
            break;
            case house3:
            {
                System.out.println("price is 3000");
            }
            break;
            case house4:
            {
                System.out.println("price is 4000");
            }
            break;
            default:
            {
                System.out.println("CHOOSE CORRECT HOUSE NAME");
            }
        }
    }
    public static void main(String args[])
    {
        String s="house2";
        Ques9 n=new Ques9(house.valueOf(s));
        n.getprice();
    }
}
