
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = 0;
        String lName = "";
        int sum = 0;
        int count = 0;
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] substr = input.split(",");
            if(substr[0].length() > longest) {
                lName = substr[0];
                longest = substr[0].length();
            }
            count++;
            sum += Integer.valueOf(substr[1]);
        }
        System.out.println("Longest name: " + lName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
