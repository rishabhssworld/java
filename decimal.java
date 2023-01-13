package function;
import java.util.Scanner;

public class decimal
{
    public static void binary(int DecNum)
    {
        int pow=0;
        int bin=0;
        while(DecNum>0)
        {
            int rem = DecNum%2;
            bin =  (bin + rem*(int)Math.pow(10,pow));

            pow++;
            DecNum = DecNum/2;

        }
        System.out.println(bin);




    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int a= sc.nextInt();
        binary(a);
    }

    
}
