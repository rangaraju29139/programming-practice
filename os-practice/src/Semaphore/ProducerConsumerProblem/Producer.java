package Semaphore.ProducerConsumerProblem;

import java.util.Queue;

public class Producer implements  Runnable{

    Queue<Object> store;
    int capacity;
    String name;

    public Producer(Queue<Object> store,int capacity,String name){
        this.store = store;
        this.capacity=capacity;
        this.name = name;
    }
    @Override
    public void run() {

        while(true){
            synchronized (store){
                if(store.size() < capacity){
                    System.out.println(name + " adding an Object, Size: "+store.size());
                    store.add(new Object());
                }
            }

        }

    }
}
