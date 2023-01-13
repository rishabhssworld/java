package arraylist;
import java.util.*;

public class Swap 
{
    public static ArrayList swapping(ArrayList<Integer> list,int idx1, int idx2)
    {
        // we have to swap 2nd and 4th element
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

        return list;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int idx1 = 2;
        int idx2 = 4;

        System.out.println(swapping(list,idx1,idx2));
    }

    
}