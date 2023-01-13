package Recursion;

public class Sum 
{
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int x = sum(n-1);
        int y = n+x;
        return y;
    }
    public static void main(String[] args)
    {
        
        System.out.println(sum(5));
    }
    
}
