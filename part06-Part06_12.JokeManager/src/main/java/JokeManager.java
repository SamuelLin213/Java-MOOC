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
import java.util.Random;
import java.util.Scanner;
public class JokeManager {
    private ArrayList<String> list;
    
    public JokeManager(){
        list = new ArrayList<>();
    }
    public void addJoke(String joke){
        list.add(joke);
    }
    public String drawJoke(){
        int index = 0;
        if (list.isEmpty()) {
            return ("Jokes are in short supply.");
        } else {
            Random draw = new Random();
            index = draw.nextInt(list.size());
        }
        return list.get(index);
    }
    public void printJokes(){
        for (String joke : list) {
            System.out.println(joke);
        }
    }
    public ArrayList<String> getJokes(){
        return list;
    }
}
