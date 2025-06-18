import java.util.*;
import java.lang.*;
 class MyThread implements Runnable {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i+1 + " : " + Thread.currentThread().getName());
        }
    }
    
}
public class Runable {
    public static void main(String[] args) {
        MyThread th = new MyThread();// Step 1: Create an object of MyThread
        Thread t=new Thread(th);// Step 2: Pass it to a new Thread object
        t.start(); // Step 3: Start the thread (calls run() internally)
    }
}
