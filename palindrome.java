package String;

import java.util.Scanner;



///not working properly

// public class palindrome 
// {
//     public static boolean check(String str)
//     {
//         for(int i=0;i<str.length()/2;i++)
//         {
//             int n = str.length();
//             if(str.charAt(i) == str.charAt(n-i-1));
//             {
//                 return true;
//             }
            
//         }
//         return false;
//     }
public class palindrome
{

    public static void main(String[] args)
    {
        String str = "racecar";
    
        System.out.println(isPalindrome(str));
    }   




public static boolean isPalindrome(String str)
{
    for(int i=0;i<str.length();i++)
    {
        int n = str.length();
        if(str.charAt(i) != str.charAt(n-1-i))
        {
            return false;
        }
    }
    return true;
}
}
