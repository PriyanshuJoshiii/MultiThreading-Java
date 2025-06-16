import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void start(){// This is the method that will be called when the thread is started it is alread been written in the Thread class
        /*
         * 
         * 
         * 
         * 
         */
        run();
    }
        public void run() {
            System.out.println("Thread is running");
        }
    }
public class Start_And_Run {
    public static void main(String[] args) {
        MyThread th =new MyThread();
        th.start();
        
    }
}
