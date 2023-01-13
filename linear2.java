package array;

public class linear2 
{
    public static int LinearSearch(String menu[],String key)
    {
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String menu[] = {"dosa","maggi","samosa","coke"};
        String key = "coke";

        int index = LinearSearch(menu, key);
        if(index ==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("index is"+index);
        }

    }
    
}
