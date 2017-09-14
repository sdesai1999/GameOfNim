import java.util.*;

/**
 * The player, or user, methods are in this class
 * 
 * @author Saurav Desai 
 * @version 11/28/15
 */
public class Player
{
    private Pile p = new Pile();
    private int marblesToTake;

    /**
     * Constructor for objects of class Player
     * constructor creates a new player (AKA the user)
     */
    public Player()
    {
        marblesToTake = 0;
    }

    /**
     * method drawMarbles
     * uses Scanner to let user take a valid amount of marbles from the pile
     * 
     * @param  none
     * @return     p.getMarbles()
     */
    public int drawMarbles()
    {
        System.out.print("How many marbles would you like to take out of the pile of " + p.getMarbles() + " marbles?: ");
        Scanner toTake = new Scanner(System.in);
        marblesToTake = toTake.nextInt();
        boolean valid = (marblesToTake >= 1) && (marblesToTake <= (p.getMarbles() / 2));
        
        while (valid == false)
        {
            System.out.print("Please take a valid amount of marbles: ");
            marblesToTake = toTake.nextInt();
            valid = (marblesToTake >= 1) && (marblesToTake <= (p.getMarbles() / 2));
        }
        
        p.takeMarbles(marblesToTake);
        return p.getMarbles();
    }
    
    /**
     * method getMarbles
     * returns amount of marbles left in the pile
     * 
     * @param  none
     * @return     p.getMarbles()
     */
    public int getMarbles()
    {
        return p.getMarbles();
    }
    
    /**
     * method takeMarbles
     * allows for CPU to take marbles from the pile (Pile "p" is created in this class)
     * 
     * @param  marblesToTake
     * @return     p.getMarbles()
     */
    public int takeMarbles(int marblesToTake)
    {
        p.takeMarbles(marblesToTake);
        return p.getMarbles();
    }
}
