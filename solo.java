package sololearn;
import  java.util.Scanner;

public class solo {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch(a)
        {
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
        }
    }
}
