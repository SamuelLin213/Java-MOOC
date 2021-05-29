
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of gift?");
        int gValue = Integer.valueOf(scan.nextLine());
        double tax;
        
        if(gValue < 5000) {
            System.out.println("No tax!");
        } else if(gValue < 25000) {
            tax = (100 + (gValue - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (gValue < 55000) {
            tax = (1700 + (gValue - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        } else if(gValue < 200000) {
            tax = (4700 + (gValue - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (gValue < 1000000) {
            tax = (22100 + (gValue - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else {
            tax = (142100 + (gValue - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
        
    }
}
