package Recursion;

public class FirstOccurence 
{
    public static int firstOccurence(int[] arr,int key, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if (arr[i] == key)
        {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,8,6,5,4,3,21,1};

        System.out.println(firstOccurence(arr, 21, 0));
    }
    
}
