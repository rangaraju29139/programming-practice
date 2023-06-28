package assig4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++){
            NumberPrinter n= new NumberPrinter(i);
//            Thread t = new Thread(n);
//            t.start();
            executor.execute(n);

        }
    }
}
