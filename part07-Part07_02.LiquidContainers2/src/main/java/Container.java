/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
public class Container {
    private int amount;
    
    public Container(){
        amount = 0;
    }
    public int contains(){
        return amount;
    }
    public void set(int amount){
        this.amount = amount;
    }
    public void add(int amount){
        if(amount >= 0){
            if(this.amount + amount > 100){
                this.amount = 100;
                return;
            }
            this.amount += amount;
        }
    }
    public void move(Container c, int amount){
        if (amount < 0 || this.amount <= 0) {
            return;
        }
        if (c.contains() + amount > 100) {
            c.set(100);
            this.amount = 0;
            return;
        }
        if (this.amount - amount < 0) {
            c.set(c.contains() + this.amount);
            this.set(0);
            return;
        }
        this.set(this.contains() - amount);
        c.set(c.contains() + amount);
    }
    public void remove(int amount){
        if(amount >= 0){
            if(this.amount - amount < 0){
                this.amount = 0;
                return;
            }
            this.amount -= amount;
        }
    }
    public String toString(){
        return (this.amount + "/100");
    }
}
