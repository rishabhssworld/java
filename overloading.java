package function;
import java.util.Scanner;

public class overloading
{
    public static int Sum(int a, int b)
    {
        return a+b;
    }
    public static int Sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(Sum(x,y));
        System.out.println(Sum(x,y,z));

        

    }
    
}
