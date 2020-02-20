package Multithreading;
//  Write a program to create a thread using Thread class and Runnable interface each.

//Extending Thread Class
class M1 extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        M1 t1=new M1();
        t1.start();
    }
}

//Implementing Runnable interface
class M2 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        M2 m1=new M2();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}