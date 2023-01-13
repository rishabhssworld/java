package String;

public class StringComparsion 
{
    public static void main(String[] args)
    {
        String s1 ="tony";
        String s2 = "tony";
        String s3 = new String("tony");



        //it will compare both the string and return equal as the memory of string s2 points the same tony of s1
        if(s1==s2)
        {
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }


        // a new memory is given to string s3 so it will show not equal
        if(s2==s3)
        {
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }

        //quals only check for the value not the memory
        if(s1.equals(s3))
        {
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }


        
    }
    
}
