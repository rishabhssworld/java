package arraylist;

//import java.util.ArrayList;  
import java.util.*;

public class Creation 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Float> List2 = new ArrayList<>();
        ArrayList<String> List3 = new ArrayList<>();

        //add element O(1)

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        List.add(4,9);   //adding through indexing

        System.out.println(List);




        //get element O(1)

        System.out.println(List.get(0));



        //remove element O(n)
        List.remove(0);
        System.out.println(List);



        //set element at index  O(n)

        List.set(3,10);
        System.out.println(List);


        //contains element O(n)

        System.out.println(List.contains(1));
        System.out.println(List.contains(2));
    }

    
}
