package array;
import java.util.Scanner;

public class largest 
{
    public static int lar(int marks[])
    {
        int largest = Integer.MIN_VALUE;  //-infinity
        for(int i =0;i<marks.length;i++)
        {
            if(largest<marks[i])
            {
                largest = marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args)
    {
        int marks[] = {1,2,6,4,5};

        int index = lar(marks);
        System.out.println(index);
        
    }
    
}
