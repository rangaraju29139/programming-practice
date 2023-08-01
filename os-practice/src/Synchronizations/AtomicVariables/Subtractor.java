package Synchronizations.AtomicVariables;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count count){
        this.count= count;
    }

    @Override
    public void run() {
        for(int i=0;i<=10000;i++){
            count.value.getAndAdd(-i) ;
            System.out.println(count.value.get() + " printed by Thread "+ Thread.currentThread().getName());
        }
    }
}
