package sololearn;
import java.util.Scanner;

public class solo4 
{
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i =0;
        while(a>0)
        {
            i = i+a;
            a--;
        }
        System.out.println(i);
        
    }
    
}
