
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String name = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(name))) {
            //code here
            while(scan.hasNextLine()) {
                String next = scan.nextLine();
                String[] info = next.split(",");
                String msg;
                if(Integer.valueOf(info[1]) == 1){
                    msg = " year";
                } else{
                    msg = " years";
                }                
                
                System.out.println(info[0] + " , age: " + info[1] + msg);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
