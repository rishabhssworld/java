package array;

public class pairs 
{
    public static void pair(int array[])
    {
        for(int i=0; i<=array.length-1;i++)
        {
            for(int j=i+1;j<=array.length-1;j++)
            {
                System.out.print("("+array[i]+","+array[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int array[] = {2,4,6,8,10};
        pair(array);
        
    }
    
}
