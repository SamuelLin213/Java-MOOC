
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] substr = input.split(",");
            if(Integer.valueOf(substr[1]) > biggest) {
                biggest = Integer.valueOf(substr[1]);
            }
        }
        System.out.println("Age of the oldest: " + biggest);
    }
}
