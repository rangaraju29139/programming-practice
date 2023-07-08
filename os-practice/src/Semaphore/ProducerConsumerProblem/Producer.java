package Semaphore.ProducerConsumerProblem;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{

    Queue<Object> store;
    int capacity;
    String name;
    Semaphore ps;
    Semaphore cs;

    public Producer(Queue<Object> store,int capacity,String name, Semaphore ps, Semaphore cs){
        this.store = store;
        this.capacity=capacity;
        this.name = name;
        this.ps= ps;
        this.cs = cs;
    }
    @Override
    public void run() {

        while(true){

            try {
                ps.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(store.size() < capacity){
                    System.out.println(name + " adding an Object, Size: "+store.size());
                    store.add(new Object());
                }

                cs.release();


        }

    }
}
