import java.util.*;
import java.util.Random;
public class Loading
{
    public static void display()
    {
        Scanner in =new Scanner(System.in);
        Random rand=new Random();
        String toDisplay="||||||||||||||||||||";
        int p=toDisplay.length(),a=0;
        int r=rand.nextInt(100);
        int ran=rand.nextInt(100);
        for(int i=0;i<p;i++)
        {
            System.out.print(toDisplay.charAt(i));
            for(int j=1;j<=300000000;j++)
            {}
        }
        System.out.print("\u000c");
        for(a=0;a<=100;a++)
        {
            System.out.println("|||||||||||||||||||| - "+a+"%");
            if(a==r || a==ran || a==99)
            {
                for(long wait=1;wait<=1000000000;wait++)
                {}}
            for(int d=1;d<=10000000;d++)
            {
                for(int w=0;w<=1000;w++)
                {}
            }
            System.out.print("\u000c");
            continue;
        }
        String toDisplay2="|||||||||||||||||||| - 100% Loaded.";
        int p2=toDisplay2.length();
        for(int i=0;i<p2;i++)
        {
            System.out.print(toDisplay2.charAt(i));
            for(int j=1;j<=300000000;j++)
            {}
        }
    }
}
 