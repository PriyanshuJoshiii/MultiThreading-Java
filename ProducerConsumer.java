import java.util.*;
class SharedData {
    private int data;
    private boolean w = true;
    public synchronized void produce(int x) {
        while (!w) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            }
        }
        data = x;
        System.out.println("Produced: " + x);
        w = false;
        notify();
    }
    public synchronized int consume() {
        while (w) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            }
        }
        w = true;
        notify();
        return data;
    }
}
class Producer extends Thread {
    SharedData d;

    public Producer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            d.produce(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Producer Interrupted");
            }
        }
    }
}

class Consumer extends Thread {
    SharedData d;

    public Consumer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Consumed: " + d.consume());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Consumer Interrupted");
            }
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        SharedData d = new SharedData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
