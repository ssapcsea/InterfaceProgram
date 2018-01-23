
/**
 * Write a description of interface RacketSports here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface RacketSports
{
    public boolean hitBall(int skill, Player p1);
    public void rally(Player p1, Player p2);
    public void pointScored (Player winner, Player loser);
    public String celebrate (Player winner); 
    public Player winMatch (Player W, Player L);
}
