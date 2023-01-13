package functionsassignment;
import java.util.Scanner;

public class que5 
{
    public static int sum(int a)
    {
        int sum = 0;
        while(a>0)
        {
            int Lastdigit = a%10;
            sum = sum +Lastdigit;
            a=a/10;
        }
        return sum;
    }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y =sum(x);
            System.out.println(y);


        }
}
