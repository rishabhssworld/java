package String;

//for a given string convert each first letter of each word to uppercase

public class uppercase 
{
    public static String toupper(String str)
    {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));   //capitalizing the letter having index 0
        sb.append(ch);                                          //appending it to sb

        for(int i=1;i<str.length();i++)                 //looping from 1st indexed element to the entire string
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)   //single quotes for char variable types
            {                                                  //if we find space then we will append that in sb and increment i and capitalize that incrimented i
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String str = "hi my name is rishabh";
        
        System.out.println(toupper(str));
    }
    
}
