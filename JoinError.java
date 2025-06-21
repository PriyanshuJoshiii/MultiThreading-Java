import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void run(){
        try{
        this.join();
        } catch(InterruptedException e){
            System.out.println(e);
    }
    for(int i=1;i<=5;i++){
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}
public class JoinError {
    public static void main(String a[]) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        //t1.join();
        for(int i=1;i<=5;i++){
            System.out.println(i + Thread.currentThread().getName());
        }
    }
    
}
// In this Program Only The Main Thread Will Run Because in run method of MyThread Class we are calling this.join() which will make the MyThread to wait for itself