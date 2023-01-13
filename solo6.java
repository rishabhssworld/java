package sololearn;
import java.util.Scanner;

public class solo6 
{
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) 
    {
        bot();
    }
    public static void bot()
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==1)
        {
            System.out.println("Order confirmed");
        }
        else if(number==2)
        {
            System.out.println("info@sololearn.com");
        }
        else{
            System.out.println( "Try again");
        } 
    }
    }

