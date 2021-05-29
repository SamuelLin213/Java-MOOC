
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: " + c1.contains() + "/100");
            System.out.println("Second: " + c2.contains() + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] substr = input.split(" ");
            String command = substr[0];
            int amount = Integer.valueOf(substr[1]);
            System.out.println("");

            if (command.equals("add")) {
                c1.add(amount);
            }
            if (command.equals("move")) {
                c1.move(c2, amount);
            }
            if (command.equals("remove")) {
                c2.remove(amount);
            }
        }
    }

}
