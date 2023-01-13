package function;

public class prime 
{
    public static boolean Isprime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%2==0)
            {
                return false;
        
            }
        }
        return true;      
    }
    public static void primesinrange(int p)
    {
        for(int x=2;x<p;x++)
        {
            if(Isprime(p))
            {
                System.out.println(x);
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        primesinrange(20);

    }
    
}
