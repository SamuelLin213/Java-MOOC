/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeCommand {
    private static ArrayList<Recipe> list;
    private static Scanner scanner;
    
    public RecipeCommand(ArrayList<Recipe> list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    //prints out all recipes
    public static void list(ArrayList<Recipe> list, Scanner scanner) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe rp : list) {
            System.out.println(rp);
        }
    }
    
    //searches for name in recipes
    public static void searchName(ArrayList<Recipe> list, Scanner scanner) {
        ArrayList<Recipe> found = new ArrayList<>();

        System.out.print("Searched word: ");
        String match = scanner.nextLine();

        for (Recipe rp : list) {
            if (rp.getName().contains(match)) {
                found.add(rp);
            }
        }
        System.out.println("");
        System.out.println("Recipes:");
        if (found.size() > 0) {            
            for (Recipe rp : found) {
                System.out.println(rp);
            }
        }
    }

    //searches for cooking time in recipes
    public static void searchTime(ArrayList<Recipe> list, Scanner scanner) {
        ArrayList<Recipe> found = new ArrayList<>();

        System.out.print("Max cooking time: ");
        int match = Integer.valueOf(scanner.nextLine());

        for (Recipe rp : list) {
            if (rp.getTime() <= match) {
                found.add(rp);
            }
        }
        System.out.println("");
        System.out.println("Recipes:");
        if (found.size() > 0) {            
            for (Recipe rp : found) {
                System.out.println(rp);
            }
        }
    }
    
    //searches for ingredients in recipes
    public static void searchIngred(ArrayList<Recipe> list, Scanner scanner) {
        ArrayList<Recipe> found = new ArrayList<>();

        System.out.print("Ingredient: ");
        String match = scanner.nextLine();

        for (Recipe rp : list) {
            for(String str: rp.getIngred()){
                if (contains(str, match)) {
                    found.add(rp);
                }
            }            
        }
        System.out.println("");
        System.out.println("Recipes:");
        if (found.size() > 0) {
            for (Recipe rp : found) {
                System.out.println(rp);
            }
        }
    }
    
    //Find exact string match for ingredients
    private static boolean contains(String str, String find) {
        String pattern = "\\b" + find + "\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        return m.find();
    }
    
    //reads info from file
    public static void readFile(Scanner fileReader, ArrayList<Recipe> list) {
        ArrayList<String> ingredients = new ArrayList<>();
        String name = fileReader.nextLine();
        int time = Integer.valueOf(fileReader.nextLine());
        while (fileReader.hasNextLine()) {
            String item = fileReader.nextLine();
            if (item.isEmpty()) {
                break;
            }
            ingredients.add(item);
        }
        list.add(new Recipe(name, time, ingredients));
    }
    
    //prints options menu
    public static void printMenu(ArrayList<Recipe> list, Scanner scanner) {

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                RecipeCommand.list(list, scanner);
            }
            if (command.equals("find name")) {
                RecipeCommand.searchName(list, scanner);
            }
            if (command.equals("find cooking time")) {
                RecipeCommand.searchTime(list, scanner);
            }
            if (command.equals("find ingredient")){
                RecipeCommand.searchIngred(list, scanner);
            }
        }
    }
}
