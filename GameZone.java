import java.util.*;
public class GameZone
{
    public static int points=50;
    public static Scanner in =new Scanner(System.in);
    public static void main(String args[])
    {
        Loading load=new Loading();
        load.display();
        System.out.println("\u000c");
        Welcome wel=new Welcome();
        wel.display();
        System.out.println("Instruction:");
        System.out.println("Hello! You are welcome to this GAME ZONE. \nYou have 50 game points.\nEvery game you want to play costs 20 points.");
        System.out.println("You get 25 points for each game you win against computer.\n\n");
        System.out.println("Start playing by choosing your game.");
        System.out.println("Game Menu:\n1)Tic Tac Toe\n2)Number Guessing Game\n3)Rock Paper Scissors\n4)Hand Cricket");
        int ch =in.nextInt();
        switch(ch)
        {
            case 1: TicTacToe.Play();
            break;
            case 2: NumberGuessingGame.play();
            break;
            case 3:RockPaperScissors.Play1();
            break;
            case 4:HandCricket.Play();
            break;
            default:System.out.println("Invalid Choice! Try Again.");
                    ch =in.nextInt();
        }
    }

    public static void replay(int n)
    {
        points+=n;
        if(points<20)
        {
            System.out.println("\u000c");
            System.out.println("Points Balance: "+points);
            System.out.println("OOOPS! You have no more points to play.");
            Exit();
        }
        System.out.println("\n\n\n");
        System.out.println("Points Balance: "+points);
        System.out.println("Game Menu:\n1)Tic Tac Toe\n2)Number Guessing Game\n3)Rock Paper Scissors\n4)Hand Cricket\n\n0)Exit");
        int ch=in.nextInt();
        System.out.println("\u000c");
        switch(ch)
        {
            case 1: TicTacToe.Play();
            break;
            case 2: NumberGuessingGame.play();
            break;
            case 3:RockPaperScissors.Play1();
            break;
            case 4:HandCricket.Play();
            break;
            case 0:Exit();
            break;
            default:System.out.println("Invalid Choice! Try Again.");
            ch =in.nextInt();
        }
    }

    public static void Exit()
    {

        System.out.println("_____________               ______      __  __             ");
        System.out.println("___  __/__  /_______ __________  /__    _ \\/ /_________  __");
        System.out.println("__  /  __  __ \\  __ `/_  __ \\_  //_/    __  /_  __ \\  / / /");
        System.out.println("_  /   _  / / / /_/ /_  / / /  ,<       _  / / /_/ / /_/ / ");
        System.out.println("/_/    /_/ /_/\\__,_/ /_/ /_//_/|_|      /_/  \\____/\\__,_/  ");
        System.out.println("\n\nTHANK YOU FOR PLAYING!!!");
        System.exit(0);
    }
}