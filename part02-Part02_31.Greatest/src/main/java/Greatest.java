
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest = number1;
        if(number2 > number1) {
            if(number2 > number3) {
                greatest = number2;
            }            
        }
        if(number3 > number1) {
            if(number3 > number2) {
                greatest = number3;
            }
        }
        
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(42, 5, 9);
        System.out.println("Greatest: " + result);
    }
}
