package Recursion;

public class Tiles 
{
    public static int tilingproblem(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        //vertical case
        int fnm1 = tilingproblem(n-1);
        //horitontal case
        int fnm2 = tilingproblem(n-2);

        return fnm1+fnm2;

    }
    public static void main(String[] args)
    {
        System.out.println(tilingproblem(3));
    }
    
}
