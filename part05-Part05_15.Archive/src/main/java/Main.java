
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Toy> list = new ArrayList<>();
        while(true){
            boolean found = false;
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            for(Toy t: list){
                if(id.equals(t.getId())){
                    found = true;
                }
            }
            if(!found){
               list.add(new Toy(id, name)); 
            }            
        }
        if(list.size() > 0){
            System.out.println("==Items==");
            for(Toy ty: list){
                System.out.println(ty);
            } 
        }
    }
}
