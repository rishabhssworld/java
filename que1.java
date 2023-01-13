package Recursion.RecursionAssignment;

public class que1 
{
    public static void indices(int[] arr, int key, int i)
    {
        if(i==arr.length)
        {
            return;
        }
        indices(arr, key, i+1);

        if(arr[i] == key)
        {
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};

        indices(arr, 2, 0);

    }
    
}
