package function;
import java.util.Scanner;

public class binary
{
    public static void decimal(int a)
    {
        int dec = 0;
        int pow = 0;
        while(a>0)
        {
            int LastDigit = a%10;
            dec = dec + (LastDigit*(int)Math.pow(2,pow));
            pow++;
            a = a/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number");
        int a= sc.nextInt();
        decimal(a);
    }

    
}
