
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        
        if(end == 0) {
            System.out.println("Factorial: 1");
        } else{
            for(int i = 1; i <= end; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
        
    }
}
