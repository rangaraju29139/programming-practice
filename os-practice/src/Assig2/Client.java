package Assig2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world printed by : "+ Thread.currentThread().getName());
        SayHello hello = new SayHello();

//        Thread t = new Thread(hello);
//        t.start();


        // directly invoking the run method make the execution sequential and all the statement run on main thread
        hello.run();


        System.out.println("before closing printed by :"+ Thread.currentThread().getName());
    }
}
