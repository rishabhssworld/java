package javabasics;
import java.util.Scanner;

public class income
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000)
        {
            tax = 0;
            System.out.println("your tax is:"+ tax);
        }
        else if(income >= 500000 && income < 1000000)
        {
            tax = (int)(0.20)*income;
            System.out.println("your tax is:"+ tax);

        }
        else
        {
            tax = (int)(0.30)*income;
            System.out.println("your tax is:"+ tax);

        }
        


    }
    
}
