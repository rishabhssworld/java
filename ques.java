package javabasics;
import java.util.Scanner;

/* 
public class ques
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("average of numbers "+ (a+b+c)/3);


    }
}
*/



/* 
public class ques
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side");
        int side = sc.nextInt();
        System.out.println("area " + side*side );

    }
}
*/

public class ques
{
    private static String x;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float tci = a+b+c;
        x = "total cost of item:" + (tci + 0.18f*tci);
        System.out.println(x);

    }
}

