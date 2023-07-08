package Semaphore.ProducerConsumerProblem;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{


    private Queue<Object> store;
    private int capacity;
    String name;
    Semaphore ps;
    Semaphore cs;

    public Consumer(Queue<Object> store, int capacity, String name, Semaphore ps, Semaphore cs){
        this.store = store;
        this.capacity=capacity;
        this.name = name;
        this.ps = ps;
        this.cs = cs;
    }
    @Override
    public void run() {
        while(true){


            try {
                cs.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(store.size() > 0){
                    System.out.println(name + " removing  an Object, Size: "+store.size());
                    store.remove();
                }

                ps.release();


        }


    }
}
