package JAVA8;

//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference


@FunctionalInterface
interface getEmployee{
    Employee getInstance(String name, int age, String city);
}

class Employee{

    String name;
    int age;
    String city;

    Employee(){

    }

    Employee(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString(){
        return "Myself " + name+" of age "+age + " from " + city;
    }

}

public class Q4 {

    public static void main(String[] args) {

        getEmployee ge = Employee::new;

        Employee e1 = ge.getInstance("Kandy", 20, "Hisar");

        System.out.println(
                e1.toString()
        );

    }
}

//interface constRef{
//    Ques4_Employee details(String name,int age,String city);
//}
//
//public class Ques4_Employee {
//
//    String name;
//    int age;
//    String city;
//
//    Ques4_Employee(String name, int age, String city) {
//        this.name = name;
//        this.age = age;
//        this.city = city;
////printdetails(name, age, city);
//    }
//
//    void printdetails() {
//        System.out.println(name + " " + age + " " + city + " ");
//
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//        constRef c1=Ques4_Employee::new;
//        Ques4_Employee employee1 = c1.details("gunjan",12,"delhi");
//        employee1.printdetails();
//
//    }
//}

