package Synchronizations.AtomicVariables;

public class Adder implements  Runnable{

    private Count count;
    public Adder(Count count){
        this.count=count;
    }
    @Override
    public void run() {

        for(int i=0;i<=10000;i++){
            count.value.getAndAdd(i);
            System.out.println(count.value.get() + " printed by Thread "+ Thread.currentThread().getName());
        }

    }
}
