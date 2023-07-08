package SynchronizeApi;

public class Adder implements  Runnable{

    private Count count;
    public Adder(Count count){
        this.count=count;
    }
    @Override
    public void run() {

        for(int i=0;i<=10000;i++){
            count.incrementCount(i);
            System.out.println(count.getValue() + " printed by Thread "+ Thread.currentThread().getName());
        }

    }
}
