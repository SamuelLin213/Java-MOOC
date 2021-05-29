/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
public class Toy {
    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public Toy(){
        this("", "");
    }
    public Toy(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return (getId() + ": " + getName());
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Toy)) {
            return false;
        }
        Toy match = (Toy) compared;
        if (this.id.equals(match.id)) {
            return true;
        }
        return false;
    }

}
