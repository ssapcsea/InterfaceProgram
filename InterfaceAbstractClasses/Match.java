
/**
 * Write a description of class Match here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Match
{
    public static void main (String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("What sport do you play? (Squash or Tennis)");
        String result = ask.nextLine();
        result = result.toLowerCase();
        Scanner askName = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = askName.nextLine();
        if (result.equals("squash")) {
            Random rand = new Random();
            int endurance = rand.nextInt(3) + 1;
            Player p1 = new Player("Sameer", result, endurance);
            int endurance2 = rand.nextInt(3) + 1;
            Player p2 = new Player(name, result, endurance2);
            Squash squash = new Squash(p1, p2);  
        }
        else if (result.equals("tennis")) {
            Random rand = new Random();
            int endurance = rand.nextInt(3) + 1;
            Player p1 = new Player("Sameer", result, endurance);
            int endurance2 = rand.nextInt(3) + 1;
            Player p2 = new Player(name, result, endurance2);
            Tennis tennis = new Tennis(p1, p2);  
        }
    }
}
