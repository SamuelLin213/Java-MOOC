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
public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight;
    
    public Suitcase(int weight){
        maxWeight = weight;
        list = new ArrayList<>();
    }
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() <= maxWeight){
           list.add(item);
        }        
    }
    public String toString() {
        String msg;
        if(list.size() != 1){
            if(list.size() == 0){
                msg = "no items";
            }else{
                msg = list.size() + " items";
            }            
        }
        else{
            msg = list.size() + " item";
        }
        return (msg + " (" + this.totalWeight() + " kg)");
    }
    public void printItems() {
        for(Item itm: list){
            System.out.println(itm);
        }
    }
    public int totalWeight(){
        int total = 0;
        for(Item itm: list){
            total += itm.getWeight();
        }
        return total;
    }
    public Item heaviestItem(){
        if(list.isEmpty()){
            return null;
        }
        Item heavy = list.get(0);
        for(Item itm: list){
            if(itm.getWeight() > heavy.getWeight()){
                heavy = itm;
            }
        }
        return heavy;
    }
}
