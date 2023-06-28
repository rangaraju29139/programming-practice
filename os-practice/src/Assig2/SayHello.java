package Assig2;

public class SayHello implements Runnable{

    public void doSomething(){
        System.out.println("doing something printed by :"+ Thread.currentThread().getName());

    }
    @Override
    public void run() {
        System.out.println("Hello World printed by :"+ Thread.currentThread().getName());
        doSomething();
    }
}
