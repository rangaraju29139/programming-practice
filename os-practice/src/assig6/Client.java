package assig6;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
      List<Integer> list = List.of(2,3,1,5,8,7,6);
        System.out.println(list + " printed by : "+ Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        MergeSorter ms = new MergeSorter(list,executorService);
        Future<List<Integer>> sortedListFuture = executorService.submit(ms);


        // independent task can be added here


      List<Integer> sortedList = sortedListFuture.get();
        System.out.println(sortedList);

      executorService.shutdown();
    }
}
