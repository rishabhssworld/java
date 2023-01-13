package sololearn;
import java.util.Scanner;

public class solo7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 

        convert(num);
        System.out.println(convert(num));
    }
    public static double convert(double num)
    {
        num = num*12;
        return num;
    }
    
}
