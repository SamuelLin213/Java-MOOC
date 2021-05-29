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
public class Hold {
    private int max;
    private ArrayList<Suitcase> list;
    
    public Hold(int max){
        this.max = max;
        list = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() <= max){
           list.add(suitcase); 
        }        
    }
    public int totalWeight() {
        int total = 0;
        for (Suitcase sc : list) {
            total += sc.totalWeight();
        }
        return total;
    }
    public String toString() {
        String msg;
        if (list.size() != 1) {
            msg = "suitcases";
        } else {
            msg = "suitcase";
        }
        
        return (list.size() + " " + msg + " (" + this.totalWeight() + " kg)");
    }
    public void printItems() {
        for(Suitcase sc: list){
            sc.printItems();
        }
    }
}
