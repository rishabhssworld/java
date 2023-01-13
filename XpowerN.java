package Recursion;

public class XpowerN 
{
    public static int Pow(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int xnm1 = Pow(x,n-1);
        int xn = x*xnm1;
        return xn;

    }
    public static void main(String[] args)
    {
        System.out.println(Pow(2,5));
    }
    
}
