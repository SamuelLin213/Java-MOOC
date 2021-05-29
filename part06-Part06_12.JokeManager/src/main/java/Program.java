
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

//        JokeManager manager = new JokeManager();
//        Scanner scanner = new Scanner(System.in);
//        UserInterface intFace = new UserInterface(manager, scanner);
//        intFace.start();
            JokeManager manager = new JokeManager();
        System.out.println(manager.drawJoke());
    }
}
