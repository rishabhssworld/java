package arraylist;
import java.util.*;

public class MultidimensionalArrayList 
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        //creating an arraylist list1 and storring some elements in that
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        //creating an arraylist list2 and storring some elements in that
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        //adding both the arraylist in the mainList
        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);


        //printing the elements in the list1,list2

        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> currentlist = mainlist.get(i);
            for(int j=0;j<currentlist.size();j++)
            {
                System.out.print(currentlist.get(j)+" ");
            }
            System.out.println();

        }
    }
    
}
