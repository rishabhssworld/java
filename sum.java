package javabasics;
import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum="+c);

    }
}