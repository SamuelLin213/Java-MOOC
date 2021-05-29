/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
public class Bird {
    private String name;
    private String latin;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
    }
    public String getLatin() {
        return latin;
    }
    public String getName() {
        return name;
    }    
    
}
