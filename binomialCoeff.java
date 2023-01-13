package function;
import java.util.Scanner;

//nCr =n!/(r!*(n-r)!)
/// n=5 r=3 n-r=2 
public class binomialCoeff
{
    public static int nFactorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    public static int binocoeff(int a, int b)
    {
        int nfact = nFactorial(a);
        int rfact = nFactorial(b);
        int nmrfact = nFactorial(a-b);

        int coeff = nfact/(rfact*nmrfact);
        return coeff;

    }

    public static void main(String[] args)
    {
        
        int x = binocoeff(5,3);
        System.out.println(x);
        
    }
    
}
