import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=9;i++){
            System.out.println(i);
        }
    }
}
public class TwoThreads {
    public static void main(String[] args) {  
        MyThread Th1=new MyThread();//Thread1 Created
        MyThread Th2=new MyThread();//Thread2 Created
        Th1.start();//Thread 1 Started
        Th2.start();//Thread 2 Started
        System.out.println("Code Finally Executed......");
    }  
}
