/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
import java.util.ArrayList;
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingred;
    
    public Recipe(String name, int time, ArrayList<String> list){
        this.name = name;
        this.time = time;
        ingred = list;
    }
    public void add(String obj){
        ingred.add(obj);
    }
    public String toString(){
        return (this.name + ", cooking time: " + this.time);
    }
    public String getName(){
        return this.name;
    }
    public int getTime(){
        return this.time;
    }
    public ArrayList<String> getIngred(){
        return this.ingred;
    }
}
