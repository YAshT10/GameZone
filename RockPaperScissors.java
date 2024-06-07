import java.util.*;
public class RockPaperScissors
{
    public static int pwin=0,cwin=0;
    public static void Play1()
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("\u000c");
        System.out.println(" ______             _        ______                             ______       _                           ");
        System.out.println("(_____ \\           | |      (_____ \\                           / _____)     (_)                          ");
        System.out.println(" _____) )___   ____| |  _    _____) )____ ____  _____  ____   ( (____   ____ _  ___  ___  ___   ____ ___ ");
        System.out.println("|  __  // _ \\ / ___) |_/ )  |  ____(____ |  _ \\| ___ |/ ___)   \\____ \\ / ___) |/___)/___)/ _ \\ / ___)___)");
        System.out.println("| |  \\ \\ |_| ( (___|  _ (   | |    / ___ | |_| | ____| |       _____) | (___| |___ |___ | |_| | |  |___ |");
        System.out.println("|_|   |_\\___/ \\____)_| \\_)  |_|    \\_____|  __/|_____)_|      (______/ \\____)_(___/(___/ \\___/|_|  (___/ ");
        System.out.print("Enter the number of rounds you want to play(A negative integer to exit early):");
        int n=in.nextInt();
        String plr="",cmp="";
        System.out.println("\nRock=0");
        System.out.println("Paper=1");
        System.out.println("Scissors=2");
        for(int i=1;i<=n;i++)
        {
            System.out.println("\nEnter Your Choice :");
            int a=in.nextInt();
            int b=rand.nextInt(3);
            if(a>=0)
            {
                if (a>=3)
                {
                    System.out.println("Invalid Number");
                }
                else
                {
                    if(a==0)
                        plr="Rock";
                    else if(a==1)
                        plr="Paper";
                    else
                        plr="Scissors";

                    if(b==0)
                        cmp="Rock";
                    else if(b==1)
                        cmp="Paper";
                    else
                        cmp="Scissors";

                    System.out.println("You chose "+plr);
                    System.out.println("Computer chose "+cmp);
                    if(a==b)
                        System.out.println("It's a tie!");
                    if((a==1&&b==0) || (a==0&&b==2) || (a==2&&b==1))
                    {
                        System.out.println("You Win!");
                        ++pwin;
                    }
                    else if((a==1&&b==2) || (a==2&&b==0) || (a==0&&b==1))
                    {
                        System.out.println("Computer Wins!");
                        ++cwin;
                    }
                }
            }
            else
                break;
        }

        System.out.println("\nYou won "+pwin+" games!");
        System.out.println("Computer won "+cwin+" games!");
        if(pwin>cwin)
        {
            System.out.println("\nYou are the CHAMPION!!!!"); 
            GameZone.replay(25);
        }
        else
        {
            System.out.println("\nAhhhh! You lost to the Computer.");
            GameZone.replay(-20);
        }
    }

}
