package String;
import java.util.Scanner;

public class compareto 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        System.out.println("enter the first string");
        s1 = sc.nextLine();
        String s2 = new String();
        System.out.println("enter the second string");
        s2 = sc.nextLine();

        if(s1.compareTo(s2)==0)
        {
            System.out.println("equal string");
        }
        else if(s1.compareTo(s2)>0)
        {
            System.out.println("s1 is greater");
        }
        else
        {
            System.out.println("s2 is greater");
        }

    }
    
}
