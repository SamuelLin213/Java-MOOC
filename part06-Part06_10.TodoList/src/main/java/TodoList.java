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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        list = new ArrayList<>();
    }
    public void add(String task) {
        list.add(task);
    }
    public void print() {
        int index = 1;
        for(String str: list) {
            System.out.println(index + ": " + str );
            index++;
        }
    }
    public void remove(int number) {
        list.remove(number-1);
    }
}
