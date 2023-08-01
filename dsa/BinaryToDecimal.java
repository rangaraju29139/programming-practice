public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010";
        int result = 0;
        int power = 1;
        int length = binary.length();
        for (int i = length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result = result + power;
            }
            power = power * 2;
        }
        System.out.println(result);
        

    }
    
}
