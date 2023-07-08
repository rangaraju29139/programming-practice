package Semaphore.ProducerConsumerProblem;

import java.util.Queue;

public class Consumer implements  Runnable{


    private Queue<Object> store;
    private int capacity;
    String name;

    public Consumer(Queue<Object> store,int capacity,String name){
        this.store = store;
        this.capacity=capacity;
        this.name = name;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store){
                if(store.size() > 0){
                    System.out.println(name + " removing  an Object, Size: "+store.size());
                    store.remove();
                }
            }

        }


    }
}
