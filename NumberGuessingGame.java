import java.util.*;
import java.util.Random;
public class NumberGuessingGame
{
    public static void play()
    {
        Scanner in=new Scanner(System.in); 
        Random rand= new Random();
System.out.println("   ______                                 _________  __              ____  _____                       __                      ");
System.out.println(" .' ___  |                               |  _   _  |[  |            |_   \\|_   _|                     [  |                     ");
System.out.println("/ .'   \\_| __   _   .---.  .--.   .--.   |_/ | | \\_| | |--.  .---.    |   \\ | |  __   _   _ .--..--.   | |.--.   .---.  _ .--. ");
System.out.println("| |   ____[  | | | / /__\\\\( (`\\] ( (`\\]      | |     | .-. |/ /__\\\\   | |\\ \\| | [  | | | [ `.-. .-. |  | '/'`\\ \\/ /__\\\\[ `/'`\\]");
System.out.println("\\ `.___]  || \\_/ |,| \\__., `'.'.  `'.'.     _| |_    | | | || \\__.,  _| |_\\   |_ | \\_/ |, | | | | | |  |  \\__/ || \\__., | |    ");
System.out.println(" `._____.' '.__.'_/ '.__.'[\\__) )[\\__) )   |_____|  [___]|__]'.__.' |_____|\\____|'.__.'_/[___||__||__][__;.__.'  '.__.'[___]   ");
        System.out.println("Instructions: ");
        System.out.println("> You have to guess a computer generated secret number(1-100) by entering your guess");
        System.out.println("> Based on your guess the computer will generate a comment.");
        System.out.println("> If you guess the number in 1 try you get 60 points, in 2 tries 50 points, in 3 tries 40 points and so on");
        System.out.println("> You have 6 guesses to find the number.");
        int sec=rand.nextInt(100)+1;
        int guess=0,count=0,points=-20;
        System.out.print("Please guess the number(0 to exit)");
        guess=in.nextInt();
        while(count<6 && guess!=0)
        {
            if(guess>sec)
                System.out.println("Try a lower number: ");
            else if(guess<sec)
                System.out.println("Try a higher number: ");
            else
                break;
            ++count;
            guess=in.nextInt();
        }
        if(guess==0)
        {
            System.out.print("You tried "+count+" times!");
            System.out.println("The Secret Number was "+sec);
        }
        else if(guess == sec)
        {
            points=70-(count*10);
            System.out.println("You guessed it in "+count+" tries!");
            System.out.println("Yes! The Secret Number is "+sec);
            System.out.println("You get "+points+" points."); 
        }
        else
        {
            System.out.print("You tried "+count+" times!");
            System.out.println("The Secret Number was "+sec);
        }
        GameZone.replay(points);
    }
}