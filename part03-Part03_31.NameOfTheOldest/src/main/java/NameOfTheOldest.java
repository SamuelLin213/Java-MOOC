
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggest = 0;
        String bName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] substr = input.split(",");
            if (Integer.valueOf(substr[1]) > biggest) {
                biggest = Integer.valueOf(substr[1]);
                bName = substr[0];
            }
        }
        System.out.println("Name of the oldest: " + bName);
    }
}
