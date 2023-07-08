package Semaphore.ProducerConsumerProblem;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int capacity = 5;
        String name;



        Producer p1 = new Producer(store,capacity,"p1");
        Producer p2 = new Producer(store,capacity,"p2");
        Producer p3 = new Producer(store,capacity,"p3");



        Consumer c1 = new Consumer(store,capacity,"c1");
        Consumer c2 = new Consumer(store,capacity,"c2");
        Consumer c3 = new Consumer(store,capacity,"c3");



        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);



        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c3);


        t1.start();
        t2.start();

        t4.start();
        t5.start();
        t6.start();


    }
}
