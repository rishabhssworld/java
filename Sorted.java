package array;

public class Sorted 
{
    public static boolean sorted(int[] array)
    {
        for(int i=0;i<=array.length;i++)
        {
            if(array[i] < array[i+1])
            {
                return true;
            }
           
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};

        System.out.println(sorted(array));

        
    }
    
}
