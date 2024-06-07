import java.util.*;
import java.util.Random;
public class HandCricket
{
    public static void Play()
    {
        Scanner in =new Scanner(System.in);
        Random rand=new Random();
        int plr=0,cmp=0,n=-1,scorep=0,scorec=0;
        System.out.println("ooooo   ooooo                             .o8       .oooooo.             o8o            oooo                      .  ");
        System.out.println("`888'   `888'                            \"888      d8P'  `Y8b            `\"'            `888                    .o8  ");
        System.out.println(" 888     888   .oooo.   ooo. .oo.    .oooo888     888          oooo d8b oooo   .ooooo.   888  oooo   .ooooo.  .o888oo");
        System.out.println(" 888ooooo888  `P  )88b  `888P\"Y88b  d88' `888     888          `888\"\"8P `888  d88' `\"Y8  888 .8P'   d88' `88b   888  ");
        System.out.println(" 888     888   .oP\"888   888   888  888   888     888           888      888  888        888888.    888ooo888   888  ");
        System.out.println(" 888     888  d8(  888   888   888  888   888     `88b    ooo   888      888  888   .o8  888 `88b.  888    .o   888 .");
        System.out.println("o888o   o888o `Y888\"\"8o o888o o888o `Y8bod88P\"     `Y8bood8P'  d888b    o888o `Y8bod8P' o888o o888o `Y8bod8P'   \"888\"");
        System.out.println("Instructions:");
        System.out.println("There Is No Limit On The Number Of Balls.");
        System.out.println("You Will First Bat. Enter Any Number From 1 To 10.");
        System.out.println("Enter The Numbers Carefully Without Making Any Mistake or the game will end.");
        System.out.println("If The Number Entered By The Computer Is Same As The Number Entered By You,");
        System.out.println("You Will Be Declared As Out.");
        System.out.println("Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
        System.out.println("After Getting Out, You Will Have To Bowl.");
        //Player Batting
        System.out.println("YOU ARE BATTING:");
        while(n!=0)
        {
            System.out.println("\nEnter Your Number: ");
            plr=in.nextInt();
            System.out.println("\u000c");
            if(plr>10 || plr<1)
            {
                System.out.println("Invalid Input");
                continue;
            }
            cmp=rand.nextInt(10)+1;
            if(cmp==plr)
            {
                n=0;
                break;
            }
            scorep+=plr;
            System.out.println("Your number: "+plr);
            System.out.println("\nComputer number: "+cmp);
            System.out.println("\nCurrent Score: "+scorep);
        }
        System.out.println("Your Number: "+plr);
        System.out.println("Computer number:" +cmp);
        System.out.println("\n\n\t\tHOWZATTT!!!");
        System.out.println("You are out!");
        System.out.println("Your Final Score is "+scorep+" runs.");
        System.out.println("\nYOU ARE BOWLING: ");
        int m=-1;

        //Computer Batting
        while(m!=0)
        {

            System.out.println("\nEnter Your Number: ");
            plr=in.nextInt();
            System.out.println("\u000c");
            if(plr>10 && plr<1)
            {
                System.out.println("Invalid Input");
                continue;
            }
            cmp=rand.nextInt(10)+1;
            if(cmp==plr)
            {
                m=0;
                break;
            }
            scorec+=cmp;
            if(scorec>scorep)
            {
                m=0;
                break;
            }
            System.out.println("\n\nYour number: "+plr);
            System.out.println("\nComputer number: "+cmp);
            System.out.println("\nComputer's Current Score: "+scorec);
        }
        System.out.println("Your Number: "+plr);
        System.out.println("Computer number:" +cmp);
        if(plr==cmp)
        {
            System.out.println("\n\n\t\tHOWZATTT!!!");
            System.out.println("You have bowled the computer out.");
        }
        System.out.println("Computer scored "+scorec+" runs.");

        if(scorec>scorep)
        {
            System.out.println("Sorry! You have lost the match!\n\n COMPUTER is the Winner!!!");

            GameZone.replay(-20);
        }
        if(scorep>scorec)
        {
            System.out.println("Congratulations! You have won the match!!!");

            GameZone.replay(25);
        }
        else
        {
            System.out.println("It's a tie!! So the match goes to the SUPER OVER!!");
            System.out.println("You are batting: ");
            int i=0;
            int scorept=0,scorect=0;
            while(i<6)
            {
                System.out.println("Enter Your Number: ");
                plr=in.nextInt();
                System.out.println("\u000c");
                if(plr>10 || plr<1)
                {
                    System.out.println("Invalid Input");
                    continue;
                }
                cmp=rand.nextInt(10)+1;
                if(cmp==plr)
                {
                    i=0;
                    break;
                }
                scorept+=plr;
                ++i;
                System.out.println("Your number: "+plr);
                System.out.println("\nComputer number: "+cmp);
                System.out.println("\nCurrent Score: "+scorept);
            }
            System.out.println("Your Number: "+plr);
            System.out.println("Computer number:" +cmp);
            System.out.println("\n\n\t\tHOWZATTT!!!");
            System.out.println("You are out!");
            System.out.println("Your Final Score is "+scorept+" runs.");
            System.out.println("\nYOU ARE BOWLING: ");
            int b=0;
            while(b<6)
            {
                System.out.println("Enter Your Number: ");
                plr=in.nextInt();
                System.out.println("\u000c");
                if(plr>10 && plr<1)
                {
                    System.out.println("Invalid Input");
                    continue;
                }
                cmp=rand.nextInt(10)+1;
                if(cmp==plr || scorect>scorept)
                {
                    b=0;
                    break;
                }
                scorec+=cmp;
                ++b;
                System.out.println("Your number: "+plr);
                System.out.println("\nComputer number: "+cmp);
                System.out.println("\nComputer's Current Score: "+scorect);
            }

            System.out.println("Your number: "+plr);
            System.out.println("\nComputer number: "+cmp);
            System.out.println("Computer scored "+scorect+" runs.");

            if(scorect>scorept)
            {
                System.out.println("Sorry! You have lost the match!\n\n COMPUTER is the Winner!!!");
                GameZone.replay(-20);
            }
            if(scorept>scorect)
            {
                System.out.println("Congratulations! You have won the match!!!");
                GameZone.replay(25);
            }
        }
    }
}