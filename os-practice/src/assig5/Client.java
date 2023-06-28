package assig5;

import java.util.Random;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random r = new Random();
        GreetingCreator gc = new GreetingCreator(r);


        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            Future<String> greetingFuture = executor.submit(gc);
            System.out.println(greetingFuture.get());
        }

        executor.shutdown();
    }
}
