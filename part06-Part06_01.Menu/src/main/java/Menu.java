
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal) {
        boolean found = false;
        
        for(String str: meals){
            if(str.equals(meal)){
                found = true;
                break;
            }
        }
        if(!found){
            meals.add(meal);
        }
        
    }
    public void printMeals() {
        for(String str: meals){
            System.out.println(str);
        }
    }
    public void clearMenu() {
        meals.clear();
    }
    // implement the required methods here
}
