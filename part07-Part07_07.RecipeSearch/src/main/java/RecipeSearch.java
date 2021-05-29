
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()){
                 RecipeCommand.readFile(fileReader, recipes);                 
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        RecipeCommand.printMenu(recipes, scanner);
    }
}
