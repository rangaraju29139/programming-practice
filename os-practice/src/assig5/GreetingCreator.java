package assig5;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingCreator implements Callable<String> {

    Random r;

    public GreetingCreator(Random r){
        this.r= r;
    }


    @Override
    public String call() throws Exception {
      if(r.nextBoolean()){
          return "hello"+ " generated by "+Thread.currentThread().getName();
      }else{
          return "bye"+ " generated by "+Thread.currentThread().getName();
      }

    }
}
