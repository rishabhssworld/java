package javabasics;
import java.util.Scanner;

public class sums 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int x = 1;
        int sum = 0;
        while(x<=n)
        {
            sum = sum + x;
            x++;
        }
        System.out.println(sum);

        
    }
}
   
