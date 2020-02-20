package Multithreading;
//Write a program using synchronization method.
class Table1{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MT1 extends Thread{
    Table1 t;
    MT1(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MT2 extends Thread{
    Table1 t;
    MT2(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class TestSynchronization2{
    public static void main(String args[]){
        Table1 obj = new Table1();//only one object
        MT1 t1=new MT1(obj);
        MT2 t2=new MT2(obj);
        t1.start();
        t2.start();
    }
}

