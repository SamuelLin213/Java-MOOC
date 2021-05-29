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
public class Stack {
    ArrayList<String> list = new ArrayList<>();
    
    public boolean isEmpty() {
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    public void add(String value) {
        list.add(value);
    }
    public ArrayList<String> values() {
        return list;
    }
    public String take() {
        return list.remove(list.size() - 1);
    }
}
