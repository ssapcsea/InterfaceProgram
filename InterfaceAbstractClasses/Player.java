
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Player
{
    public String name; 
    public int squashSkill; //1 through 25
    public int badmintonSkill; //1 through 25
    public int tennisSkill; //1 through 25
    public int endurance; //value 1 to 3
    public int fatigue;
    public int score;
    public int gameScore;
    public int matchScore; 
    public Player(String name, String sport, int endurance) {
        this.name = name;
        if (sport.equals("squash")) {
            this.squashSkill = 15;
            this.tennisSkill = 7;
            this.badmintonSkill = 4;
        } else if (sport.equals("tennis")) {
            this.tennisSkill = 15;
            this.squashSkill = 7;
            this.badmintonSkill = 4;
        } else if (sport.equals("badminton")) {
            this.badmintonSkill = 15;
            this.tennisSkill = 7;
            this.squashSkill = 4;
        }
        this.endurance = endurance;
        this.fatigue = 0;
        this.score = 0;
        this.gameScore = 0;
        this.matchScore = 0;
    }
    public String toString() {
        return "Hi! My name is " + this.name; 
    }
    public boolean equals(Object o) {
        Player p = (Player)o;
        if (this.squashSkill == p.squashSkill || this.tennisSkill == p.tennisSkill) {
            return true;
        }
        return false;
    }
}
