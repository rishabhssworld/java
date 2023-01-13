package arraylist;

import java.util.*;

public class Size 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //printing size of the ArrayList
          System.out.println(list.size());


          for(int i =0;i<list.size();i++)
          {
            System.out.print(list.get(i)+" ");

          }
    }
    
}
