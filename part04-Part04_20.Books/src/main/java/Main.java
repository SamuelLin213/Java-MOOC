import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        for(Book bk: books) {
            if(input.equals("everything")){
                System.out.println(bk);
            } else {
                System.out.println(bk.getTitle());
            }
        }
    }
}
