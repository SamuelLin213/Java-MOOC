
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String usr = scanner.nextLine();
        System.out.println("Enter password: ");
        String pw = scanner.nextLine();
        
        if(usr.equals("alex") || usr.equals("emma")) {
            if((usr.equals("alex") && pw.equals("sunshine")) || (usr.equals("emma") && pw.equals("haskell"))) {
                System.out.println("You have successfully logged in!");
            }
        } else{
            System.out.println("Incorrect username or password!");
        }
    }
}
