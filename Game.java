import java.util.*;

/**
 * The "CPU" or "Computer" class is the same thing as Game
 * 
 * @author Saurav Desai 
 * @version 11/29/15
 */
public class Game // CPU
{
    private Player user = new Player();
    private int marblesToTake;
    private int targMarbles;
    
    /**
     * Constructor for objects of class Game
     * constructor creates a new "CPU"
     */
    public Game()
    {
        marblesToTake = 0;
        targMarbles = 0;
    }

    /**
     * method cpuDrawMarbles
     * cpu draws marbles in either smart mode, or stupid mode
     * 
     * @param  none
     * @return     user.getMarbles()
     */
    public int cpuDrawMarbles()
    {
        Random r = new Random();
        int smartOrStupid = r.nextInt(2);
        
        if (smartOrStupid == 1) //stupid mode
        {
            Random r1 = new Random();
            marblesToTake = r.nextInt(user.getMarbles()/2) + 1;
            user.takeMarbles(marblesToTake);
            return user.getMarbles();
        }
        else //smart mode
        {
            if (user.getMarbles() == 3 || user.getMarbles() == 7 || user.getMarbles() == 15 || user.getMarbles() == 31 || user.getMarbles() == 63)
            {
                Random r2 = new Random();
                marblesToTake = r2.nextInt(user.getMarbles()/2) + 1;
                user.takeMarbles(marblesToTake);
                return user.getMarbles();
            }
            else
            {
                Random r3 = new Random();
                int target = r3.nextInt(5);
                
                if (target == 0)
                {
                    targMarbles = 3;
                }
                else if (target == 1)
                {
                    targMarbles = 7;
                }
                else if (target == 2)
                {
                    targMarbles = 15;
                }
                else if (target == 3)
                {
                    targMarbles = 31;
                }
                else
                {
                    targMarbles = 63;
                }
                
                marblesToTake = user.getMarbles() - targMarbles;
                boolean valid = (marblesToTake >= 1) && (marblesToTake <= (user.getMarbles() / 2));
                
                while (valid == false)
                {
                    Random r4 = new Random();
                    target = r4.nextInt(5);
                    
                    if (target == 0)
                    {
                        targMarbles = 3;
                    }
                    else if (target == 1)
                    {
                        targMarbles = 7;
                    }
                    else if (target == 2)
                    {
                        targMarbles = 15;
                    }
                    else if (target == 3)
                    {
                        targMarbles = 31;
                    }
                    else
                    {
                        targMarbles = 63;
                    }
                    
                    marblesToTake = user.getMarbles() - targMarbles;
                    valid = (marblesToTake >= 1) && (marblesToTake <= (user.getMarbles() / 2));
                }
                
                user.takeMarbles(marblesToTake);
                return user.getMarbles();
            }
        }
    }
    
    /**
     * method drawOneMarble
     * either CPU or user draws one marble at the end because taking 1 marble from 1 marble doesn't
     * fit the rules of taking less than half of the marbles
     * 
     * @param  oneMarble
     * @return     user.getMarbles()
     */
    public int drawOneMarble(int oneMarble)
    {
        user.takeMarbles(oneMarble);
        return user.getMarbles();
    }
    
    /**
     * method playerDrawMarbles
     * allows for the player to draw marbles in the main method
     * 
     * @param  none
     * @return     user.getMarbles()
     */
    public int playerDrawMarbles()
    {
        user.drawMarbles();
        return user.getMarbles();
    }
    
    /**
     * method getMarbles
     * returns the amount of marbles in the pile
     * 
     * @param  none
     * @return     user.getMarbles
     */
    public int getMarbles()
    {
        return user.getMarbles();
    }
}
