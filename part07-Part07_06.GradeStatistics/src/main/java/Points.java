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
public class Points {
    private ArrayList<Integer> list;
    private int total;
    private int count;
    private int passing;
    private int passingCnt;
    
    public Points(){
        list = new ArrayList<>();
        total = 0;
        count = 0;
        passing = 0;
        passingCnt = 0;
    }
    public void add(int num){
        if(num < 0 || num > 100){
            return;
        }
        total += num;
        count++;
        if(num >= 50){
            passing += num;
            passingCnt++;
        }
        list.add(num);
    }
    public double calculateAvg(){
        return (1.0*total/count);
    }
    public double passingAvg(){
        return (1.0*passing/passingCnt);
    }
    public double passingPercent(){
        return (1.0*passingCnt/count*100);
    }
    public int[] gradeDistro(){
        int[] count = new int[6];
        for(int i: list){
            if(i < 50){
                count[5] += 1;
            }
            else if(i < 60){
                count[4] += 1;
            }
            else if(i < 70){
                count[3] += 1;
            }
            else if(i < 80){
                count[2] += 1;
            }
            else if(i < 90){
                count[1] += 1;
            }
            else if(i <= 100){
                count[0] += 1;
            }
        }
        return count;
    }
    public void printStars(){
        int[] count = gradeDistro();
        int x = 5;
        for(int i: count){
            System.out.print(x + ": ");
            for(int z = 0; z < i; z++){
                System.out.print("*");
            }
            System.out.println("");
            x--;
        }
    }
    public void print(){
        System.out.println("Point average (all): " + calculateAvg());
        if(passingCnt == 0){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): " + passingAvg());
        }
        System.out.println("Pass percentage: " + passingPercent());
        System.out.println("Grade distribution:");
        printStars();
    }
}
