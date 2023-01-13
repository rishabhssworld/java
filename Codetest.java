package Miscellaneous;
import java.util.*;


//sorting an array using an inbuilt method of java using Arrays.sort();

// Arrays is a class and that class is having a method of sorting

public class Codetest 
{
    public static void main(String[] args)
    {
        int[] arr = {2,5,1,6,8,9};

        Arrays.sort(arr);


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
