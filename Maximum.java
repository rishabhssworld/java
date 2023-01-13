package arraylist;
import java.util.*;

public class Maximum 
{
    public static int Max(ArrayList<Integer> list)
    {
        int largest = Integer.MIN_VALUE;  //-infinity
        for(int i =0;i<list.size();i++)
        {
            if(largest<list.get(i))
            {
                largest = list.get(i);
            }
        }
        return largest;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);

        System.out.println(Max(list));

        
    }  
}
