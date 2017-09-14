import java.util.*;

/**
 * Game of Nim project for AP Computer Science
 * 
 * @author Saurav Desai
 * @version 11/29/30
 */
public class NimDriver
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        System.out.println("This is a game called \"Nim\". There is an initial pile of marbles. You and the CPU will take");
        System.out.println("turns drawing marbles from the pile. You have to take at least 1 marble, but you can't take more");
        System.out.println("than half of the marbles that are in the pile. Whoever takes the last marble loses. Either you or");
        System.out.println("the CPU will go first, and that will be random.");
        System.out.println();

        Game cpu = new Game();

        Random r = new Random();
        int whoGoesFirst = r.nextInt(2);

        System.out.println("There are " + cpu.getMarbles() + " marbles in the pile to begin with.");

        if (whoGoesFirst == 0) // player goes first
        {
            System.out.println("You are going first this time.");
            System.out.println();

            while (cpu.getMarbles() != 0)
            {
                cpu.playerDrawMarbles();
                System.out.println("After your draw, the number of marbles left is " + cpu.getMarbles() + ".");;
                System.out.println();

                if (cpu.getMarbles() == 1)
                {
                    System.out.println("The CPU took the last marble, so you win!");
                    System.out.println();
                    cpu.drawOneMarble(1);
                }
                else
                {
                    cpu.cpuDrawMarbles();
                    System.out.println("After the CPU's draw, the number of marbles left is " + cpu.getMarbles() + ".");
                    System.out.println();

                    if (cpu.getMarbles() == 1)
                    {
                        System.out.print("There is only 1 marble left! Take it by typing \"1\".: ");
                        Scanner fin = new Scanner(System.in);
                        int one = fin.nextInt();
                        while (one != 1)
                        {
                            System.out.print("Please take exactly 1 marble by typing \"1\".: ");
                            one = fin.nextInt();
                        }

                        cpu.drawOneMarble(one);
                        System.out.println("You took the last marble, so the CPU wins!");
                        System.out.println();
                    }
                }
            }
        }
        else // CPU goes first
        {
            System.out.println("The CPU is going first this time.");
            System.out.println();

            while (cpu.getMarbles() != 0)
            {
                cpu.cpuDrawMarbles();
                System.out.println("After the CPU's draw, the number of marbles left is " + cpu.getMarbles() + ".");
                System.out.println();

                if (cpu.getMarbles() == 1)
                {
                    System.out.print("There is only 1 marble left! Take it by typing \"1\".: ");
                    Scanner fin = new Scanner(System.in);
                    int one = fin.nextInt();
                    while (one != 1)
                    {
                        System.out.print("Please take exactly 1 marble by typing \"1\".: ");
                        one = fin.nextInt();
                    }

                    cpu.drawOneMarble(one);
                    System.out.println("You took the last marble, so the CPU wins!");
                    System.out.println();
                }
                else
                {
                    cpu.playerDrawMarbles();
                    System.out.println("After your draw, the number of marbles left is " + cpu.getMarbles() + ".");;
                    System.out.println();

                    int marbles = cpu.getMarbles();
                    if (marbles == 1)
                    {
                        System.out.println("The CPU took the last marble, so you win!");
                        System.out.println();
                        cpu.drawOneMarble(1);
                    }
                }
            }
        }
    }
}
