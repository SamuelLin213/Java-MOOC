
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            //code here
            while(scan.hasNextLine()) {
                list.add(scan.nextLine());
            }            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        for(String str: list) {
            if(str.equals(searchedFor)) {
                found = true;
                System.out.println("Found!");
                break;
            }
        }
        if(found == false) {
            System.out.println("Not found.");
        }

    }
}
