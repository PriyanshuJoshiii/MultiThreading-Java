import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println( i + Thread.currentThread().getName()  );
        }
}
}
public class Join {
    public static void main(String[] args)throws InterruptedException {
        MyThread th1=new MyThread();
        th1.start();
        th1.join();
        for(int i=1;i<=5;i++){
            System.out.println( i + Thread.currentThread().getName());
        }
    }

}
