import java.util.*;
import java.lang.*;
class MyThread1 extends Thread{
    Table t;
    public MyThread1(Table t){
        this.t = t;
        }
        public void run(){
            System.out.println(Thread.currentThread().getName());
            t.display(8);
            }
}
class MyThread2 extends Thread{
    Table t;
    public MyThread2(Table t){
        this.t = t;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        t.display(9);
    }

}
class  Table{
    synchronized  void display (int n){
        for (int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
public class MutualExSynchronization {
    public static void main(String[] args) {
        Table t=new Table();
        MyThread1 th1=new MyThread1(t);
        MyThread2 th2=new MyThread2(t);
        th1.start();
        th2.start();

    }
    
}
// in this program we are using synchronized keyword to make the display method thread safe
// the synchronized keyword is used to lock the object on which it is called
// so when one thread is executing the display method it will lock the object and other threads will not