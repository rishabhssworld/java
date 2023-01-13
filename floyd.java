package pattern;

public class floyd 
{
    public static void main(String[] args)
    {
    int counter = 1;
    int n=5;
    for(int i=1;i<=5;i++)
    {
        for (int j=1;j<=i;j++)
        {
            System.out.print(counter+" ");
            counter++;

        }
        System.out.println(" ");

    }
}
}
    
