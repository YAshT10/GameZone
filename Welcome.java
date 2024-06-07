import java.util.*;
public class Welcome extends GameZone
{
    public static void display()
    {
        Animation an=new Animation();
        an.display();
        System.out.println("\u000C");
        Animation4 obj = new Animation4();
        obj.animate();
    }
}