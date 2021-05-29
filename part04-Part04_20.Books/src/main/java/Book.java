/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slin
 */
public class Book {
    String title;
    int pages;
    int year;
    
    public Book(String ttl, int pg, int yr) {
        this.title = ttl;
        this.pages = pg;
        this.year = yr;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public int getYear(){
        return year;
    }
    public String toString() {
        return (getTitle() + ", " + getPages() + " pages, " + getYear());
    }
}
