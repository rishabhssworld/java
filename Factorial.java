package Recursion;

public class Factorial 
{
    // public static void fact(int n)
    // {
    //     int fact =1;
    //     for(int i=1;i<=n;i++)
    //     {
    //         fact = fact*i;
    //     }
    //     System.out.println(fact);
    // }

    public static int Fact(int n)
    {
        if(n==0)
        {
            return 1;
        } 
        int fnm1 = Fact(n-1);
        int fn = n * fnm1;
        return fn;  
    }
    public static void main(String[] args)
    {
        //fact(5);
        
        System.out.println(Fact(5));

    }
    
}

