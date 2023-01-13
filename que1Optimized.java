package Recursion.RecursionAssignment;

public class que1Optimized 
{
    public static void occurance(int[] arr, int key, int i)
    {
        if(i==arr.length)
        {
            return;
        }
        if(arr[i]==key)
        {
            System.out.print(i+" ");
        }
        occurance(arr, key, i+1);
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};

        occurance(arr, 2, 0);
    }
    
}
