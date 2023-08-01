public class DecimalToBinary{

     public static void main(String []args){
        int n = 20;
        int result =0;
        int power =1;
        while(n>0){
            int rem = n%2;
            n=n/2;
            result = rem*power + result;
            power = power*10;
        }
        System.out.println(result);
        
     }
}