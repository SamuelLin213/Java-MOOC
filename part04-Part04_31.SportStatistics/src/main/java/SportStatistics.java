//More complicated solution, doesn't use an additional class(didn't know server
//would accept new class since it wasn't stated in instructions)
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        int count = 0;
//        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();
        ArrayList<Integer> score1 = new ArrayList<>();
        ArrayList<Integer> score2 = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            //code here
            while(scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(",");
                team1.add(str[0]);
                team2.add(str[1]);
                score1.add(Integer.valueOf(str[2]));
                score2.add(Integer.valueOf(str[3]));
//                list.add(str);
//                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int i = 0;
        for(String str: team1) {
            if(str.equals(team) || team2.get(i).equals(team)){
                count++;
            }
            i++;
        }
        System.out.println("Games: " + count);
                
        int wins = 0;
        int loss = 0;
        i = 0;
        for(String str: team1){
            if (str.equals(team) || team2.get(i).equals(team)) {
                if((score1.get(i) > score2.get(i) && str.equals(team)) || 
                    (score1.get(i) < score2.get(i) && team2.get(i).equals(team))){
                    wins++;
                }
                else if ((score1.get(i) < score2.get(i) && str.equals(team))
                        || (score1.get(i) > score2.get(i) && team2.get(i).equals(team))) {
                    loss++;
                }
            }
            i++;
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
    }

}
