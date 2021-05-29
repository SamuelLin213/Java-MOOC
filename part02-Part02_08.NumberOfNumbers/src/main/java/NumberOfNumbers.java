
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                break;
            } else {
                numNum += 1;
            }
        }
        
        System.out.println("Number of numbers: " + numNum);
    }
}
