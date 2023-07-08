package SynchronizeApi;

public class Count {
    private int value = 0;

    public synchronized void incrementCount(int offset){

        value += offset;
    }

    public synchronized int getValue(){
        return value;
    }
    public synchronized void decrementCount(int offset){
        value -= offset;
    }

}
