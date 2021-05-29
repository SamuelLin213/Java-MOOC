
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                break;
            } else if(input > 0) {
                sum += input;
                num += 1;
            }
        }
        if(num == 0){
            System.out.println("Cannot calculate the average");
        } else{
            double avg = 1.0*sum/num;
            System.out.println(avg);
        }
        
    }
}
