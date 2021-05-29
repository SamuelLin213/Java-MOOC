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
public class Room {
    private ArrayList<Person> list;
    
    public Room(){
        this.list = new ArrayList<>();
    }
    public void add(Person person) {
        list.add(person);
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons() {
        return list;
    }
    public Person shortest() {
        if(list.isEmpty()){
            return null;
        }
        Person shortest = list.get(0);
        for(Person pr: list){
            if(pr.getHeight() < shortest.getHeight()){
                shortest = pr;
            }
        }
        return shortest;
    }
    public Person take() {
        if(list.isEmpty()){
            return null;
        }
        Person shortest = this.shortest();
        list.remove(shortest);
        return shortest;
    }
}
