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
public class Database {
    private ArrayList<Bird> birds;
    private ArrayList<String> observations;
    private static Scanner scanner;
    
    public Database(Scanner scanner){
        this.birds = new ArrayList<>(); 
        this.observations = new ArrayList<>();
        this.scanner = scanner;
    }
    public void add(){
        System.out.print("Name: ");
        String nm = scanner.nextLine();
        System.out.print("Name in latin: ");
        String ltn = scanner.nextLine();
        birds.add(new Bird(nm, ltn));
    }
    public void observation(){
        System.out.print("Bird? ");
        String bd = scanner.nextLine();
        for(Bird bird: birds){
            if(bird.getName().contains(bd)){
             observations.add(bd);
             return;
            }
        }
        System.out.println("Not a bird!");
    }
    public void all(){
        for(Bird bd: birds){
            System.out.println(bd.getName() + " (" + bd.getLatin() + "): " + 
                    getObs(bd) + " observations");
        }
    }
    public void one(){
        System.out.print("Bird? ");
        String match = scanner.nextLine();
        for(Bird bd: birds){
            if(bd.getName().equals(match)){
                System.out.println(bd.getName() + " (" + bd.getLatin() + "): " 
                    + getObs(bd) + " observations");
                break;
            }
        }
    }
    public int getObs(Bird bird){
        String name = bird.getName();
        int count = 0;
        
        for(String str: observations){
            if(str.equals(name)){
                count++;
            }
        }
        return count;
    }
    public void menu(){
        while(true){
            System.out.print("? ");
            String cmd = scanner.nextLine();
            
            if(cmd.equals("Quit")){
                break;
            }
            else if(cmd.equals("Add")){
                add();
            }
            else if(cmd.equals("Observation")){
                observation();
            }
            else if(cmd.equals("All")){
                all();
            }
            else if(cmd.equals("One")){
                one();
            }
        }
        
        
    }
}
