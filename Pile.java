import java.util.*;

/**
 * This class resembles the pile of marbles
 * 
 * @author Saurav Desai
 * @version 11/28/15
 */
public class Pile
{
    private int marbles;

    /**
     * Constructor for objects of class Pile
     * constructor creates a pile of marbles between 10 and 100
     */
    public Pile()
    {
        Random r = new Random();
        marbles = r.nextInt(91) + 10;
    }

    /**
     * method takeMarbles
     * either player or CPU takes marbles from the pile
     * 
     * @param  marblesToTake
     * @return     none
     */
    public void takeMarbles(int marblesToTake)
    {
        marbles = marbles - marblesToTake;
    }
    
    /**
     * method getMarbles
     * returns amount of marbles in the pile
     * 
     * @param  none
     * @return     marbles
     */
    public int getMarbles()
    {
        return marbles;
    }
}
