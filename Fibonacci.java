package Recursion;

public class Fibonacci 
{
    public static int fib(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else if (n==1)
        {
            return 1;
        }
        int x = fib(n-1);
        int y = fib(n-2);
        int z = x + y;
        return z;

    }
    public static void main(String[] args)
    {
        System.out.println(fib(10));
    }
    
}
