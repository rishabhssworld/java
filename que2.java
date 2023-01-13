package functionsassignment;
import java.util.Scanner;
public class que2 
{
    public static boolean isEven(int a)
    {
        if (a%2==0)
        {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean y = isEven(x);
        System.out.println(y);

    }
    
}