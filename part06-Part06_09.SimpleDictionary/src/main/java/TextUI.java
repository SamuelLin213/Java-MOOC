/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scan, SimpleDictionary dict){
        this.scanner = scan;
        this.dict = dict;
    }
    public void start() {
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                break;
            }
            if(command.equals("add")){
                System.out.print("Word: ");
                String wd = scanner.nextLine();
                System.out.print("Translation: ");
                String trans = scanner.nextLine();
                dict.add(wd, trans);
                continue;
            }
            if(command.equals("search")){
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                if(dict.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                System.out.println("Translation: " + dict.translate(search));
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}
