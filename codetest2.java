package Miscellaneous;
import java.util.ArrayList;

//multiply elements of 2 arrays having same indicies
public class codetest2 
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i=0;i<arr1.length;i++)
        {
            int x = arr1[i]*arr2[i];

            list1.add(x);
        }

        System.out.println(list1);

    }
    
}
