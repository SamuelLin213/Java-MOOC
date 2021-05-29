
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] substr = input.split(" ");
            String command = substr[0];
            int amount = Integer.valueOf(substr[1]);
            System.out.println("");
            
            if(command.equals("add")){
                if(amount < 0){
                    continue;
                }
                if(first + amount > 100){
                    first = 100;
                    continue;
                }
                first += amount;
            }
            if(command.equals("move")){
                if(amount < 0 || first <= 0){
                    continue;
                }
                if(second + amount > 100){
                    second = 100;
                    first = 0;
                    continue;
                }
                if(first - amount < 0){
                    second += first;
                    first = 0;
                    continue;
                }
                first -= amount;
                second += amount;
            }
            if(command.equals("remove")){
                if (amount < 0 || second <= 0) {
                    continue;
                }
                if (second - amount < 0) {
                    second = 0;
                    continue;
                }
                second -= amount;
            }
        }
    }

}
