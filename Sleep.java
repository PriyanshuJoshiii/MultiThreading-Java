import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void run(){
        Thread Th=Thread.currentThread();
        String name=Th.getName();
        for(int i=1;i<=5;i++){
            System.out.println(name+" "+i);
            try{
                Thread.sleep(250);
            }
            catch(InterruptedException e){
                System.out.println("Exception caught");
            }
        }

    }

}
public class Sleep {
    public static void main(String A[]){
        MyThread th1=new MyThread();
        th1.start();
        Thread Th=Thread.currentThread();
        String name=Th.getName();
        for(int i=1;i<=5;i++){
            System.out.println(name+" "+i);
            try{
                Thread.sleep(250);
            }
            catch(InterruptedException e){
                System.out.println("Exception caught");
            }
        }
        
    }
    
}
