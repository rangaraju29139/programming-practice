package Assig3;

public class NumberPrinter implements Runnable{
     int numberToPrint;
     NumberPrinter(int numberToPrint){
         this.numberToPrint = numberToPrint;
     }

    @Override
    public void run() {
        System.out.println(numberToPrint+" printed by Thread:"+ Thread.currentThread().getName());

    }
}
