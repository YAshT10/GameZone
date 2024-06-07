public class Animation extends Welcome
{
    public static void display()
    {
        String toDisplay="___       __    ______                                 ________      \t\t\n__ |     / /_______  /__________________ ________      ___  __/_____ \t\t\n__ | /| / /_  _ \\_  /_  ___/  __ \\_  __ `__ \\  _ \\     __  /  _  __ \\\t\t\n__ |/ |/ / /  __/  / / /__ / /_/ /  / / / / /  __/     _  /   / /_/ /\t\t\n____/|__/  \\___//_/  \\___/ \\____//_/ /_/ /_/\\___/      /_/    \\____/";
        int p=toDisplay.length();
        for(int i=0;i<p;i++)
        {
            System.out.print(toDisplay.charAt(i));
            for(int j=1;j<=3000000;j++)
            {
                for(int k=1;k<1000;k++)
                {}
            }
        }
    }
}