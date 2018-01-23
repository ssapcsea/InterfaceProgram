
/**
 * Write a description of class Tennis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Tennis implements RacketSports
{
    public Tennis(Player p1, Player p2) {
        rally(p1, p2);
    }
    public boolean hitBall(int skill, Player p1) {
        if (skill > p1.fatigue) {
            //System.out.println("Hit ball");
            Random rand = new Random();
            int add = rand.nextInt(6) + 1 - p1.endurance; 
            p1.fatigue += add;
            return true;
        }
        //System.out.println("Missed ball");
        p1.fatigue = 0;
        return false;
    }
    public void rally(Player p1, Player p2) { 
        boolean p1Shot = hitBall(p1.tennisSkill, p1);
        boolean p2Shot = hitBall(p2.tennisSkill, p2);
        if (p1Shot && p2Shot) {
            rally(p1, p2);
        }
        else if (!p1Shot && p2Shot) {
            //System.out.println(p2.name + " scored");
            pointScored(p2, p1);
        } else if (p1Shot && !p2Shot) {
            //System.out.println(p1.name + " scored");
            pointScored(p1, p2);
        }
        else {
            //System.out.println(p1.name + " scored");
            pointScored(p1, p2);
        }
    }
    public void pointScored (Player winner, Player loser) { 
        winner.score += 15;
        if ((winner.score >= 45 && loser.score < 45) ||  (winner.score >= 45 && loser.score >= 45 && winner.score > (loser.score + 15))) {
            winner.gameScore += 1; 
            //System.out.println(winner.name + ": " + winner.score + ", " + loser.name + ": " + loser.score);
            Random rand = new Random();
            int chance = rand.nextInt(2);
            if (chance == 1) {
                winner.endurance -= 1;
            }
            if ((winner.gameScore >= 6 && winner.gameScore > (loser.gameScore + 1)) || winner.gameScore == 7) {
                System.out.println(winner.name + " has won the set!");
                System.out.println(celebrate(winner));
                System.out.println(winner.name + ": " + winner.gameScore + ", " + loser.name + ": " + loser.gameScore);
                winner.matchScore += 1;
                if (winner.matchScore == 3) {
                    System.out.println(winner.name + " has won the match!");
                    System.out.println("Sets- " + winner.name + ": " + winner.matchScore + ", " + loser.name + ": " + loser.matchScore);
                    winMatch(winner, loser);
                } else {
                    winner.gameScore = 0;
                    loser.gameScore = 0;
                    winner.score = 0;
                    loser.score = 0;
                    rally(winner, loser);
                }
            } else {
                winner.score = 0;
                loser.score = 0;
                rally(winner, loser);
            }
        } else {
            rally(winner, loser);
        }
    }
    public String celebrate (Player winner) {
        Random rand = new Random();
        int chance = rand.nextInt(2);
        if (chance == 1) {
            return winner.name + " says, AHHHHH!";
        }
        return "No celebration";
    }
    public Player winMatch (Player W, Player L) {
        W.score = 0;
        L.score = 0;
        W.squashSkill += 5;
        return W;
    }
    public String toString() {
        return "This is the sport of tennis.";
    }
}
