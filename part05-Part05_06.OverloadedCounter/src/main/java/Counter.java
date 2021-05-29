/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
public class Counter {
    private int count;
    
    public Counter() {
        count = 0;
    }
    public Counter(int startValue) {
        count = startValue;
    }
    public int value() {
        return count;
    }
    public void increase() {
        this.increase(1);
    }
    public void increase(int increaseBy) {
        if(increaseBy >= 0){
            count += increaseBy;
        }
    }
    public void decrease() {
        this.decrease(1);
    }
    public void decrease(int decreaseBy) {
        if(decreaseBy >= 0){
            count -= decreaseBy;
        }
    }
    
}
